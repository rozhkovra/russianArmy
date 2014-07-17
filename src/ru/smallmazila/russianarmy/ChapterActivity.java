package ru.smallmazila.russianarmy;

import java.io.IOException;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.data.DataStore;
import ru.smallmazila.russianarmy.data.Filter;
import ru.smallmazila.russianarmy.impl.water.WaterChapter;
import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;
import ru.smallmazila.russianarmy.util.Util;
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
import android.widget.Toast;

public class ChapterActivity extends Activity {
	private boolean logoView = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_chapter);	
				
		Chapter chapter = DataStore.chapters.get(getIntent().getLongExtra("chapterId",0L));
		setTitle(chapter.getName());
		
		TableLayout table = (TableLayout)findViewById(R.id.mainTable);
		if(chapter instanceof WaterChapter)
			table.setBackgroundResource(R.drawable.water_background_800_480);

		for(String um : chapter.getUnitModels().keySet()){
			TableRow row = new TableRow(this);
		
			TextView view = new TextView(this);
			view.setText(chapter.getUnitModel(um).getName()+" "+chapter.getUnitModel(um).getShortName());
			view.setTypeface(null, Typeface.BOLD);
			row.addView(view);
			
			table.addView(row);
			
			if(!logoView)
				createTable(chapter.getUnitModel(um), table);
			else
				createLogoTable(chapter.getUnitModel(um), table);
		}


	}
	
	private void createTable(UnitModel um, TableLayout table){
		TableRow row = null;
		for (Unit unit : um.getUnits().values()){
			row = new TableRow(this);
			TextView view = new TextView(this);
			view.setId((int)unit.getId());
			view.setText(unit.getNumber()+" "+unit.getTitle());
			view.setOnClickListener(new View.OnClickListener() {			
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Unit unit = Util.findUnitById((long)v.getId());
					if(unit!=null){
						Intent i = new Intent();
						i.putExtra("unitId", unit.getId());
						Filter.unitId = unit.getId();
						Filter.unitModel = unit.getUnitModel().getName();
						RunUtil.runArgsActivity(ChapterActivity.this, UnitCardActivity.class, i);
					}else
						Toast.makeText(getApplicationContext(), "Error of getting unit!", Toast.LENGTH_SHORT);
				}
			});
			row.addView(view);	
			table.addView(row);
		}

	}
	
	private void createLogoTable(UnitModel um, TableLayout table){
	    Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();  // deprecated
		int height = display.getHeight();  // deprecated

		TableRow row = null;
		int k = 0;
		for (Unit unit : um.getUnits().values()){
			if(k%2 == 0){
				row = new TableRow(this);
				table.addView(row);
			}
			ImageView iView = new ImageView(this);
			Bitmap bmp = null; 
			try{	
				bmp = BitmapFactory.decodeStream(getAssets().open(unit.getLogo()));
			}catch(IOException e){
			}
//			int iWidth = bmp.getWidth();
//			int iHeight = bmp.getHeight();
			int newWidth = width/2;
			//int newHeight = iHeight*newWidth/iWidth;
			int newHeight = newWidth;
			bmp=Bitmap.createScaledBitmap(bmp, newWidth, newHeight, true);
			iView.setImageBitmap(bmp);		
			iView.setId((int)unit.getId());
			iView.setOnClickListener(new View.OnClickListener() {			
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Unit unit = Util.findUnitById((long)v.getId());
					if(unit!=null){
						Intent i = new Intent();
						i.putExtra("unitId", unit.getId());
						Filter.unitId = unit.getId();
						Filter.unitModel = unit.getUnitModel().getName();
						RunUtil.runArgsActivity(ChapterActivity.this, UnitCardActivity.class, i);
					}else
						Toast.makeText(getApplicationContext(), "Error of getting unit!", Toast.LENGTH_SHORT);
				}
			});
			row.addView(iView);				
			k++;
		}
	}

}
