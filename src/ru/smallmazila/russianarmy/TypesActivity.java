package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;

public class TypesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_types);
		
		Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();  // deprecated
		int height = display.getHeight();  // deprecated
		
		Button waterButton = (Button)findViewById(R.id.button1);
		waterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RunUtil.runEmptyActivity(TypesActivity.this, WaterActivity.class);
			}
		});		
		waterButton.setLayoutParams(new LayoutParams(width/2, height/2));
		
		Button airButton = (Button)findViewById(R.id.button2);
		airButton.setLayoutParams(new LayoutParams(width/2, height/2));

		Button earthButton = (Button)findViewById(R.id.button3);
		earthButton.setLayoutParams(new LayoutParams(width/2, height/2));

		Button otherButton = (Button)findViewById(R.id.button4);
		otherButton.setLayoutParams(new LayoutParams(width/2, height/2));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_types, menu);
		return true;
	}

}
