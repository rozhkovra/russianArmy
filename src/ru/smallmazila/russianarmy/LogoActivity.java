package ru.smallmazila.russianarmy;

import java.util.ArrayList;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.data.MyData;
import ru.smallmazila.russianarmy.impl.water.WaterChapter;
import ru.smallmazila.russianarmy.impl.water.WaterTth;
import ru.smallmazila.russianarmy.impl.water.WaterUnit;
import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;
import ru.smallmazila.russianarmy.impl.water.WaterUnitSize;
import ru.smallmazila.russianarmy.impl.water.WaterWeapon;
import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.Weapon;
import ru.smallmazila.russianarmy.vacabulary.WeaponType;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
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
		ImageView image = (ImageView)findViewById(R.id.imageView1);
		
	    if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
			image.setImageResource(R.drawable.rusarmylogo_480_800);
		else
			image.setImageResource(R.drawable.rusarmylogo_800_480);
		
		image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RunUtil.runEmptyActivity(LogoActivity.this, TypesActivity.class);
			}
		});

	    Chapter chapter = new WaterChapter("Авианосец (АВ)");
	    ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	    weapons.add(new WaterWeapon("Гранит", 12, WeaponType.ROCKET));
	    weapons.add(new WaterWeapon("Удав-1", 60, WeaponType.ROCKET));
	    weapons.add(new WaterWeapon("Клинок", 192, WeaponType.ZRK));
	    weapons.add(new WaterWeapon("Каштан", 256, WeaponType.ZRK));
		chapter.addUnitModel(new WaterUnitModel("11435").addUnit(new WaterUnit(1
																			, "ТАКР \"Адмирал флота Советского Союза Кузнецов\""
																			, "\"Адмирал флота Советского Союза Кузнецов\" - тяжелый авианесущий крейсер проекта 11435, единственный авианосец России."
																			, new WaterTth(29, 45, 1960, 0)
																			, weapons
																			, new WaterUnitSize(302.3, 72.3, 9.14, 43000)
																			, R.drawable.aircraft_carrier_kuznetsov ))
																			);
		
		MyData.chapters.put(Long.valueOf(1L), chapter);

		chapter = new WaterChapter("С баллистическими ракетами (ПЛАРБ)");
		chapter.addUnitModel(new WaterUnitModel("955").addUnit(new WaterUnit(2
																			, "Атомный ракетный подводный крейсер стратегического назначения \"Юрий Долгорукий\""
																			, "Атомный ракетный подводный крейсер стратегического назначения \"Юрий Долгорукий\""
																			, new WaterTth(29, 90, 107, 190)
																			, new ArrayList<Weapon>()
																			, new WaterUnitSize(160, 13.5, 10, 14720)
																			, R.drawable.submarine_borei_955_yuri_dolgorukii ))																		
																			);		
		MyData.chapters.put(Long.valueOf(2L), chapter);

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);

		ImageView image = (ImageView)findViewById(R.id.imageView1);
	    if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) 
			image.setImageResource(R.drawable.rusarmylogo_480_800);
		else 
			image.setImageResource(R.drawable.rusarmylogo_800_480);
	}

}
