package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.data.DataStore;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class FlotLogoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    DataStore.initFlot(getApplicationContext().getAssets());
	    setContentView(R.layout.activity_logo);
		ImageView image = (ImageView)findViewById(R.id.imageView1);
		
	    if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
			image.setImageResource(R.drawable.rusflotlogo_800_480);
		else
			image.setImageResource(R.drawable.rusflotlogo_800_480);
		
		image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				RunUtil.runEmptyActivity(FlotLogoActivity.this, WaterActivity.class);
			}
		});
	}
}
