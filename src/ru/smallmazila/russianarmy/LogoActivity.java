package ru.smallmazila.russianarmy;

import ru.smallmazila.android.activity.RunUtil;
import ru.smallmazila.russianarmy.data.MyData;
import ru.smallmazila.russianarmy.impl.water.WaterChapter;
import ru.smallmazila.russianarmy.impl.water.WaterTth;
import ru.smallmazila.russianarmy.impl.water.WaterUnit;
import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;
import ru.smallmazila.russianarmy.impl.water.WaterUnitSize;
import ru.smallmazila.russianarmy.impl.water.WaterWeapon;
import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.WeaponList;
import ru.smallmazila.russianarmy.vacabulary.UnitStatus;
import ru.smallmazila.russianarmy.vacabulary.WeaponType;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

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
				//RunUtil.runEmptyActivity(LogoActivity.this, TypesActivity.class);
				RunUtil.runEmptyActivity(LogoActivity.this, TypesActivity.class);
			}
		});

	    long id = 1L;
		Chapter chapter = new WaterChapter("Авианосец (АВ)")
				.addUnitModel(new WaterUnitModel("11435"));
	    WeaponList weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("Гранит", 12, WeaponType.ROCKET)
	    			  	, new WaterWeapon("Удав-1", 60, WeaponType.ROCKET)
	    				, new WaterWeapon("Клинок", 192, WeaponType.ZRK)
	    				, new WaterWeapon("Каштан", 256, WeaponType.ZRK)}
	    		);
		chapter.addUnitModel(new WaterUnitModel("11435").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "ТАКР \"Адмирал флота Советского Союза Кузнецов\""
				, "\"Адмирал флота Советского Союза Кузнецов\" - тяжелый авианесущий крейсер проекта 11435, единственный авианосец России."
				, new WaterTth(29, 45, 1960, 0)
				, weapons
				, new WaterUnitSize(302.3, 72.3, 9.14, 43000)
				, UnitStatus.AVAILABLE
				, R.drawable.aircraft_carrier_kuznetsov ))
				);		
		MyData.chapters.put(Long.valueOf(id), chapter);
		
		id++;
		chapter = new WaterChapter("Ракетные крейсера")
				.addUnitModel(new WaterUnitModel[]{
						  new WaterUnitModel("1144")
						, new WaterUnitModel("11442")
						, new WaterUnitModel("1164")}
				);
		weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("АК-130", 840, WeaponType.ARTILLERY)
	    				, new WaterWeapon("АК-630АД", 48000, WeaponType.ARTILLERY)
	    				, new WaterWeapon("ПЛР \"Водопад-НК\"", 20, WeaponType.TORPEDO)
	    				, new WaterWeapon("Удав-1", 60, WeaponType.ROCKET)
		    			, new WaterWeapon("РБУ-12000", 0, WeaponType.BOMB)
	    				, new WaterWeapon("РБУ-1000 \"Смерч-3\"", 0, WeaponType.BOMB)
		    			, new WaterWeapon("РГБ-10", 0, WeaponType.BOMB)
		    			, new WaterWeapon("Гранит", 20, WeaponType.ROCKET)
		    			, new WaterWeapon("С-300Ф \"Форт\" / \"Форт-М\"", 0, WeaponType.ZRK)
		    			, new WaterWeapon("48Н6Е / 48Н6Е2", 0, WeaponType.ZRK)
		    			, new WaterWeapon("4К33 \"Оса-М / МА\"", 0, WeaponType.ZRK)
		    			, new WaterWeapon("9М33М / МА", 0, WeaponType.ZRK)
		    			, new WaterWeapon("3М87 \"Кортик\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("9М311", 0, WeaponType.ZRK)}
	    		);
		chapter.getUnitModel("1144").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "ТАРКР \"Адмирал Лазарев\""
				, "\"Адмирал Лазарев\" - тяжелый атомный ракетный крейсер проекта 1144 \"Орлан\""
				, new WaterTth(31, 0, 727, 0)
				, weapons
				, new WaterUnitSize(252, 28.5, 9.1, 26190)
				, UnitStatus.REPAIR
				, R.drawable.orlan_lazarev )
				);
		weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("ПЛР \"Водопад-НК\"", 20, WeaponType.TORPEDO)
	    				, new WaterWeapon("РБУ-12000", 0, WeaponType.BOMB)
	    				, new WaterWeapon("РБУ-1000 \"Смерч-3\"", 0, WeaponType.BOMB)
	    				, new WaterWeapon("РГБ-10", 0, WeaponType.BOMB)
	    				, new WaterWeapon("РПК-6М \"Водопад\" 533 мм", 0, WeaponType.TORPEDO)
	    				, new WaterWeapon("Гранит", 20, WeaponType.ROCKET)
	    				, new WaterWeapon("С-300Ф \"Форт\" / \"Форт-М\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("48Н6Е / 48Н6Е2", 0, WeaponType.ZRK)
	    				, new WaterWeapon("4К33 \"Оса-М / МА\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("9М33М / МА", 0, WeaponType.ZRK)
	    				, new WaterWeapon("3М87 \"Кортик\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("9М311", 0, WeaponType.ZRK)}
	    		);
		chapter.getUnitModel("11442").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "ТАРКР \"Адмирал Нахимов\""
				, "\"Адмирал Нахимов\" - тяжелый атомный ракетный крейсер проекта 11442"
				, new WaterTth(32, 0, 727, 140)
				, weapons
				, new WaterUnitSize(252, 28.5, 9.1, 26190)
				, UnitStatus.REPAIR
				, R.drawable.p11442_nahimov)
				);
		weapons = new WeaponList();
	    weapons.add(new WaterWeapon[]{
	    			  new WaterWeapon("АК-130", 0, WeaponType.ARTILLERY)
	    			, new WaterWeapon("Гранит", 20, WeaponType.ROCKET)
	    			, new WaterWeapon("Риф", 96, WeaponType.ZRK)
	    			, new WaterWeapon("Клинок", 0, WeaponType.ZRK)
	    			, new WaterWeapon("3М87 \"Каштан\"", 0, WeaponType.ZRK)
	    			, new WaterWeapon("РПК-6М \"Водопад\" 533 мм", 0, WeaponType.TORPEDO)
	    			, new WaterWeapon("РКПТЗ-1 \"Удав-1М\"", 0, WeaponType.ANTITORPEDO)
	    			, new WaterWeapon("РБУ-12000", 0, WeaponType.BOMB)
	    			, new WaterWeapon("РБУ-1000 \"Смерч-3\"", 0, WeaponType.BOMB)}
	    		);
		chapter.getUnitModel("11442").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "ТАРКР \"Петр Великий\""
				, "\"Петр Великий\" - тяжелый атомный ракетный крейсер проекта 11442, флагман Северного флота ВМФ РФ, крупнейший в мире неавианесущий ударный корабль (на 2008 год)." 
				, new WaterTth(31, 0, 655, 140)
				, weapons
				, new WaterUnitSize(251.1, 28.5, 10.3, 25860)
				, UnitStatus.AVAILABLE
				, R.drawable.p11442_petr_velikiy)
				);
		
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
						  new WaterWeapon("П-1000 \"Вулкан\"", 16, WeaponType.ROCKET)
						, new WaterWeapon("АК-130", 2, WeaponType.ARTILLERY)
						, new WaterWeapon("АК-630", 6, WeaponType.ARTILLERY)
						, new WaterWeapon("С-300Ф Риф", 64, WeaponType.ZRK)
						, new WaterWeapon("\"Оса-МА\"", 48, WeaponType.ZRK)
						, new WaterWeapon("533 мм", 0, WeaponType.TORPEDO)
						, new WaterWeapon("РБУ-6000", 0, WeaponType.BOMB)}
				);
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "ГРКР \"Москва\""
				, "\"Москва\" - ракетный крейсер, головной корабль проекта 1164 \"Атлант\"" 
				, new WaterTth(32, 30, 510, 100)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 8.4, 11490)
				, UnitStatus.AVAILABLE
				, R.drawable.atlant_moskva)
				);

		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("П-500 \"Базальт\"", 16, WeaponType.ROCKET)
				, new WaterWeapon("АК-130", 2, WeaponType.ARTILLERY)
				, new WaterWeapon("АК-630", 6, WeaponType.ARTILLERY)
				, new WaterWeapon("С-300Ф Риф", 64, WeaponType.ZRK)
				, new WaterWeapon("\"Оса-МА\"", 48, WeaponType.ZRK)
				, new WaterWeapon("533 мм", 0, WeaponType.TORPEDO)
				, new WaterWeapon("РБУ-6000", 0, WeaponType.BOMB)}
		);
		
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "ГРКР \"Варяг\""
				, "\"Москва\" - ракетный крейсер проекта 1164 \"Атлант\"" 
				, new WaterTth(32, 30, 480, 0)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 8.4, 11490)
				, UnitStatus.AVAILABLE
				, R.drawable.atlant_variag)
				);
		
		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("П-500 \"Базальт\"", 16, WeaponType.ROCKET)
				, new WaterWeapon("АК-130", 2, WeaponType.ARTILLERY)
				, new WaterWeapon("АК-630", 6, WeaponType.ARTILLERY)
				, new WaterWeapon("С-300Ф Риф", 64, WeaponType.ZRK)
				, new WaterWeapon("\"Оса-МА\"", 48, WeaponType.ZRK)
				, new WaterWeapon("533 мм", 10, WeaponType.TORPEDO)
				, new WaterWeapon("РБУ-6000", 2, WeaponType.BOMB)}
		);
		
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "РКР \"Маршал Устинов\""
				, "\"Маршал Устинов\" - ракетный крейсер проекта 1164" 
				, new WaterTth(32, 30, 476, 0)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 7.6, 11280)
				, UnitStatus.REPAIR
				, R.drawable.atlant_marshal_ustinov)
				);
		

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;
		
		chapter = new WaterChapter("С баллистическими ракетами (ПЛАРБ)");
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
						  new WaterWeapon("533 мм", 0, WeaponType.TORPEDO)
						, new WaterWeapon("Булава", 12, WeaponType.BALLISTIC_ROCKET)}
				);				
		chapter.addUnitModel(new WaterUnitModel("955").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "Атомный ракетный подводный крейсер стратегического назначения \"Юрий Долгорукий\""
				, "Атомный ракетный подводный крейсер стратегического назначения \"Юрий Долгорукий\""
				, new WaterTth(29, 90, 107, 190)
				, weapons
				, new WaterUnitSize(160, 13.5, 10, 24000)
				, UnitStatus.AVAILABLE
				, R.drawable.submarine_borei_955_yuri_dolgorukii ))																		
				);

		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("533 мм", 0, WeaponType.TORPEDO)
				, new WaterWeapon("Булава", 16, WeaponType.BALLISTIC_ROCKET)}
		);				
		chapter.getUnitModel("955").addUnit(new WaterUnit(
			++WaterUnit.currentId
			, "Атомный ракетный подводный крейсер стратегического назначения \"Александр Невский\""
			, "\"Александр Невский\" - атомный ракетный подводный крейсер стратегического назначения четвертого поколения проекта 955 \"Борей\"."
			, new WaterTth(29, 90, 107, 190)
			, weapons
			, new WaterUnitSize(170, 13.5, 10, 24000 )
			, UnitStatus.BUILD
			, R.drawable.submarine_borei_955_aleksandr_nevskiy)																		
			);
		
		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("533 мм", 0, WeaponType.TORPEDO)
				, new WaterWeapon("Булава", 16, WeaponType.BALLISTIC_ROCKET)}
		);				
		chapter.getUnitModel("955").addUnit(new WaterUnit(
			++WaterUnit.currentId
			, "Атомный ракетный подводный крейсер стратегического назначения \"Владимир Мономах\""
			, "\"Владимир Мономах\" - атомный ракетный подводный крейсер стратегического назначения четвертого поколения проекта 955 \"Борей\"."
			, new WaterTth(29, 90, 107, 190)
			, weapons
			, new WaterUnitSize(170, 13.5, 10, 24000 )
			, UnitStatus.BUILD
			, R.drawable.submarine_borei_955_vladimir_monomah)																		
			);

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;

		chapter = new WaterChapter("С крылатыми ракетами (ПЛАРК)");
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
							new WaterWeapon("533 мм", 10, WeaponType.TORPEDO)
						  , new WaterWeapon("650 мм", 10, WeaponType.TORPEDO)
						  , new WaterWeapon("П-100 \"Оникс\"", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("Х-35", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("Х-101", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("ЗМ-54Э", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("ЗМ-54Э1", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("ЗМ-14Э",0, WeaponType.WING_ROCKET)}
		);				
		chapter.addUnitModel(new WaterUnitModel("855").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "Многоцелевая атомная подводная лодка с крылатыми ракетами \"Северодвинск\""
				, "\"Северодвинск\" - многоцелевая атомная подводная лодка с крылатыми ракетами, головной корабль проекта 855 \"Ясень\"."
				, new WaterTth(31, 100, 90, 0)
				, weapons
				, new WaterUnitSize(119, 13.5, 9.4, 13800)
				, UnitStatus.AVAILABLE
				, R.drawable.submarine_yasen_855_severodvinsk))																		
				);

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;
		
		RunUtil.createFliper(this).fromLayout = (LinearLayout)findViewById(R.id.mainLayout);

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
