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

public class ChapterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapter);

		Intent intent = getIntent();
		
		TextView text = (TextView)findViewById(R.id.textView1);
		text.setText(intent.getStringExtra("ChapterTitle"));
		
		TableLayout table = (TableLayout)findViewById(R.id.mainTable);	
		
		TableRow row = new TableRow(this);
		
		TextView view = new TextView(this);
		view.setText("11435");
		view.setTypeface(null, Typeface.BOLD);
		row.addView(view);
			
		table.addView(row);
		
		row = new TableRow(this);

		view = new TextView(this);
		view.setText("- Адмирал флота Советсвого Союза Кузнецов");
		view.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("UnitTitle", "ТАКР \"Адмирал флота Советского Союза Кузнецов\"");
				RunUtil.runArgsActivity(ChapterActivity.this, UnitCardActivity.class, i);
			}
		});
		row.addView(view);

		table.addView(row);
	}

}
