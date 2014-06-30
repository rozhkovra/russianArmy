package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.data.Filter;
import ru.smallmazila.russianarmy.data.MyData;
import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.Unit;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ChapterActivity extends Activity {
	private Unit curUnit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_chapter);
				
		Chapter chapter = MyData.chapters.get(getIntent().getLongExtra("chapterId",0L));
		setTitle(chapter.getName());
		
		TableLayout table = (TableLayout)findViewById(R.id.mainTable);
		
		for(String um : chapter.getUnitModels().keySet()){
			TableRow row = new TableRow(this);
		
			TextView view = new TextView(this);
			view.setText(chapter.getUnitModel(um).getName());
			view.setTypeface(null, Typeface.BOLD);
			row.addView(view);
			
			table.addView(row);
		
			for (Unit unit : chapter.getUnitModel(um).getUnits().values()){
				curUnit = unit;
				row = new TableRow(this);

				view = new TextView(this);
				view.setText(unit.getTitle());
				view.setOnClickListener(new View.OnClickListener() {			
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent i = new Intent();
						i.putExtra("unitId", curUnit.getId());
						Filter.unitId = curUnit.getId();
						Filter.unitModel = curUnit.getUnitModel().getName();
						RunUtil.runArgsActivity(ChapterActivity.this, UnitCardActivity.class, i);
					}
				});
				row.addView(view);

				table.addView(row);
			}
		}
	}
}
