package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class TypesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_types);
		
		Button waterButton = (Button)findViewById(R.id.Button1);
		waterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RunUtil.runEmptyActivity(TypesActivity.this, WaterActivity.class);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_types, menu);
		return true;
	}

}
