package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.impl.water.WaterChapter;
import ru.smallmazila.russianarmy.impl.water.WaterUnit;
import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;
import ru.smallmazila.russianarmy.model.Chapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class LogoActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        
		setContentView(R.layout.activity_logo);
		
		Chapter chapter = new WaterChapter("БНКОК");
		chapter.addUnitModel(new WaterUnitModel("11435").addUnit(new WaterUnit(1,"Адмирал флота Советсвого Союза Кузнецов", "", "29 узлов\n 45 суток\n 1960 чел", ""
				, "Длина: 302, 3 м.\nШирина: 72,3 м.\nОсадка: 9,14 м.\nВодоизмещение: 58600 тонн", R.drawable.aircraft_carrier_kuznetsov )));		
		
		ImageView image = (ImageView)findViewById(R.id.imageView1);
		image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RunUtil.runEmptyActivity(LogoActivity.this, TypesActivity.class);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_logo, menu);
		return true;
	}

}
