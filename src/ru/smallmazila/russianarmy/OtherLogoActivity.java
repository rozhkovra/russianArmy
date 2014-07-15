package ru.smallmazila.russianarmy;

import ru.smallmazila.russianarmy.data.MyData;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class OtherLogoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		MyData.initFlot();
	    setContentView(R.layout.activity_logo);
		ImageView image = (ImageView)findViewById(R.id.imageView1);
			
		image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				RunUtil.runEmptyActivity(WWSLogoActivity.this, VVSActivity.class);
			}
		});
	}
}
