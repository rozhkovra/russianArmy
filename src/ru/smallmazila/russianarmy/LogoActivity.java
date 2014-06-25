package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.impl.water.WaterChapter;
import ru.smallmazila.russianarmy.impl.water.WaterUnit;
import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;
import ru.smallmazila.russianarmy.model.Chapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class LogoActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        
		setContentView(R.layout.activity_logo);
		
		Chapter chapter = new WaterChapter("�����");
		chapter.addUnitModel(new WaterUnitModel("11435").addUnit(new WaterUnit(1,"������� ����� ���������� ����� ��������", "", "29 �����\n 45 �����\n 1960 ���", ""
				, "�����: 302, 3 �.\n������: 72,3 �.\n������: 9,14 �.\n�������������: 58600 ����", R.drawable.aircraft_carrier_kuznetsov )));		
		
		ImageView image = (ImageView)findViewById(R.id.imageView1);
		image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RunUtil.runEmptyActivity(LogoActivity.this, TypesActivity.class);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_logo, menu);
		return true;
	}

}
