package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.data.Filter;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WaterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_water);

		setTitle("—ÓÒÚ‡‚ ¬Ã‘ –‘");
		
		TableLayout table = (TableLayout)findViewById(R.id.mainTable);	
		
		TableRow row = new TableRow(this);
		
		TextView view = new TextView(this);
		view.setText("Õ‡‰‚Ó‰Ì˚Â");
		view.setTypeface(null, Typeface.BOLD);
		row.addView(view);
		
		view = new TextView(this);
		view.setText("œÓ‰‚Ó‰Ì˚Â");
		view.setTypeface(null, Typeface.BOLD);
		row.addView(view);
				
		table.addView(row);
		
		row = new TableRow(this);

		view = new TextView(this);
		view.setText("-¡Õ Œ ");
		row.addView(view);

		view = new TextView(this);
		view.setText("-œÀ¿–¡");
		row.addView(view);

		table.addView(row);

		row = new TableRow(this);

		Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();  // deprecated
		int height = display.getHeight();  // deprecated

		ImageView iView = new ImageView(this);

	    Bitmap bmp;
	    bmp=BitmapFactory.decodeResource(getResources(),R.drawable.aircraft_carrier_chapter);//image is your image                                                            
		int iWidth = bmp.getWidth();
		int iHeight = bmp.getHeight();
		int newWidth = width/4;
		int newHeight = iHeight*width/4/iWidth;
		bmp=Bitmap.createScaledBitmap(bmp, newWidth, newHeight, true);
		iView.setImageBitmap(bmp);		

		iView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("chapterId", 1L);
				Filter.chapterId=1L;
				RunUtil.runArgsActivity(WaterActivity.this, ChapterActivity.class, i);
			}
		});
		row.addView(iView);

		iView = new ImageView(this);

	    bmp=BitmapFactory.decodeResource(getResources(),R.drawable.submarine_ballistic_chapter);//image is your image                                                            
		bmp=Bitmap.createScaledBitmap(bmp, newWidth, newHeight, true);
		iView.setImageBitmap(bmp);		

		iView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("chapterId", 3L);
				Filter.chapterId=3L;
				RunUtil.runArgsActivity(WaterActivity.this, ChapterActivity.class, i);
			}
		});
		row.addView(iView);

		table.addView(row);
		
		row = new TableRow(this);
		
		iView = new ImageView(this);

	    bmp=BitmapFactory.decodeResource(getResources(),R.drawable.craiser_chapter);//image is your image                                                            
		bmp=Bitmap.createScaledBitmap(bmp, newWidth, newHeight, true);
		iView.setImageBitmap(bmp);		

		iView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("chapterId", 2L);
				Filter.chapterId=2L;
				RunUtil.runArgsActivity(WaterActivity.this, ChapterActivity.class, i);
			}
		});
		row.addView(iView);
		
		view = new TextView(this);
		view.setText("-œÀ¿– ");
		row.addView(view);

		table.addView(row);
		
		row = new TableRow(this);
		
		view = new TextView(this);
		view.setText("");
		row.addView(view);

		iView = new ImageView(this);

	    bmp=BitmapFactory.decodeResource(getResources(),R.drawable.yasen_855);//image is your image                                                            
		bmp=Bitmap.createScaledBitmap(bmp, newWidth, newHeight, true);
		iView.setImageBitmap(bmp);		

		iView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("chapterId", 4L);
				Filter.chapterId=4L;
				RunUtil.runArgsActivity(WaterActivity.this, ChapterActivity.class, i);
			}
		});
		row.addView(iView);
		
		table.addView(row);
	}

}
