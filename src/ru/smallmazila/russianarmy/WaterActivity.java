package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WaterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_water);

		setTitle("Состав ВМФ РФ");
		
		TableLayout table = (TableLayout)findViewById(R.id.mainTable);	
		
		TableRow row = new TableRow(this);
		
		TextView view = new TextView(this);
		view.setText("Надводные");
		view.setTypeface(null, Typeface.BOLD);
		row.addView(view);
		
		view = new TextView(this);
		view.setText("Подводные");
		view.setTypeface(null, Typeface.BOLD);
		row.addView(view);
				
		table.addView(row);
		
		row = new TableRow(this);

		view = new TextView(this);
		view.setText("-БНКОК");
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
				i.putExtra("ChapterTitle", "Авианосцы");
				RunUtil.runArgsActivity(WaterActivity.this, ChapterActivity.class, i);
			}
		});
		row.addView(iView);

		table.addView(row);
	}

}
