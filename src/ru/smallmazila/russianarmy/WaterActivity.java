package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WaterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_water);

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

		view = new TextView(this);
		view.setText("--АВ");
		view.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("ChapterTitle", "Авианосцы");
				RunUtil.runArgsActivity(WaterActivity.this, ChapterActivity.class, i);
			}
		});
		row.addView(view);

		table.addView(row);
	}

}
