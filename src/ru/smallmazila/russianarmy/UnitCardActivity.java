package ru.smallmazila.russianarmy;

import ru.smallmazila.russianarmy.data.Filter;
import ru.smallmazila.russianarmy.data.MyData;
import ru.smallmazila.russianarmy.impl.water.WaterUnit;
import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.util.Util;
import ru.smallmazila.russianarmy.vacabulary.UnitStatus;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class UnitCardActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);

	    fillActivity(getResources().getConfiguration());
	}

	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);
	    fillActivity(newConfig);
	}

	private void fillActivity(Configuration newConfig){
	    // Checks the orientation of the screen
	    if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
			setContentView(R.layout.activity_unit_card_portrait);
		else
			setContentView(R.layout.activity_unit_card_landscape);         

	    Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();  // deprecated
		int height = display.getHeight();  // deprecated
		
		ImageView image = (ImageView)findViewById(R.id.imageView1);

		long unitId = getIntent().getLongExtra("unitId", 0L);
		Unit unit = MyData.chapters.get(Filter.chapterId).getUnitModels().get(Filter.unitModel).getUnit(unitId);

		Bitmap bmp = BitmapFactory.decodeResource(getResources(),unit.getImage());                                                            
		int iWidth = bmp.getWidth();
		int iHeight = bmp.getHeight();
		int newWidth = width*4/9;
		if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) 
			newWidth = width*2/3;
		int newHeight = iHeight*newWidth/iWidth;
		bmp=Bitmap.createScaledBitmap(bmp, newWidth, newHeight, true);
		image.setImageBitmap(bmp);		
		
		TextView text = (TextView)findViewById(R.id.title);
		text.setText(unit.getTitle());
		
		TextView text5 = (TextView)findViewById(R.id.desc);
		text5.setText(unit.getDescription());

		text5 = (TextView)findViewById(R.id.tth);
		text5.setText(unit.getTth().toString());

		text5 = (TextView)findViewById(R.id.unitsize);
		text5.setText(unit.getSize().toString());

		text5 = (TextView)findViewById(R.id.weapon);
		if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
			text5.setText(Util.weapons(unit.getWeapons(),"\n"));
		else
			text5.setText(Util.weapons(unit.getWeapons(),"; "));
		
		text5 = (TextView)findViewById(R.id.flot);
		text5.setText(((WaterUnit)unit).getFlot().getName());
		
		text5 = (TextView)findViewById(R.id.number);
		text5.setText(((WaterUnit)unit).getNumber());		

	}
}
