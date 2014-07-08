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
		Chapter chapter = new WaterChapter("��������� (��)")
				.addUnitModel(new WaterUnitModel("11435"));
	    WeaponList weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("������", 12, WeaponType.ROCKET)
	    			  	, new WaterWeapon("����-1", 60, WeaponType.ROCKET)
	    				, new WaterWeapon("������", 192, WeaponType.ZRK)
	    				, new WaterWeapon("������", 256, WeaponType.ZRK)}
	    		);
		chapter.addUnitModel(new WaterUnitModel("11435").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "���� \"������� ����� ���������� ����� ��������\""
				, "\"������� ����� ���������� ����� ��������\" - ������� ����������� ������� ������� 11435, ������������ ��������� ������."
				, new WaterTth(29, 45, 1960, 0)
				, weapons
				, new WaterUnitSize(302.3, 72.3, 9.14, 43000)
				, UnitStatus.AVAILABLE
				, R.drawable.aircraft_carrier_kuznetsov ))
				);		
		MyData.chapters.put(Long.valueOf(id), chapter);
		
		id++;
		chapter = new WaterChapter("�������� ��������")
				.addUnitModel(new WaterUnitModel[]{
						  new WaterUnitModel("1144")
						, new WaterUnitModel("11442")
						, new WaterUnitModel("1164")}
				);
		weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("��-130", 840, WeaponType.ARTILLERY)
	    				, new WaterWeapon("��-630��", 48000, WeaponType.ARTILLERY)
	    				, new WaterWeapon("��� \"�������-��\"", 20, WeaponType.TORPEDO)
	    				, new WaterWeapon("����-1", 60, WeaponType.ROCKET)
		    			, new WaterWeapon("���-12000", 0, WeaponType.BOMB)
	    				, new WaterWeapon("���-1000 \"�����-3\"", 0, WeaponType.BOMB)
		    			, new WaterWeapon("���-10", 0, WeaponType.BOMB)
		    			, new WaterWeapon("������", 20, WeaponType.ROCKET)
		    			, new WaterWeapon("�-300� \"����\" / \"����-�\"", 0, WeaponType.ZRK)
		    			, new WaterWeapon("48�6� / 48�6�2", 0, WeaponType.ZRK)
		    			, new WaterWeapon("4�33 \"���-� / ��\"", 0, WeaponType.ZRK)
		    			, new WaterWeapon("9�33� / ��", 0, WeaponType.ZRK)
		    			, new WaterWeapon("3�87 \"������\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("9�311", 0, WeaponType.ZRK)}
	    		);
		chapter.getUnitModel("1144").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "����� \"������� �������\""
				, "\"������� �������\" - ������� ������� �������� ������� ������� 1144 \"�����\""
				, new WaterTth(31, 0, 727, 0)
				, weapons
				, new WaterUnitSize(252, 28.5, 9.1, 26190)
				, UnitStatus.REPAIR
				, R.drawable.orlan_lazarev )
				);
		weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("��� \"�������-��\"", 20, WeaponType.TORPEDO)
	    				, new WaterWeapon("���-12000", 0, WeaponType.BOMB)
	    				, new WaterWeapon("���-1000 \"�����-3\"", 0, WeaponType.BOMB)
	    				, new WaterWeapon("���-10", 0, WeaponType.BOMB)
	    				, new WaterWeapon("���-6� \"�������\" 533 ��", 0, WeaponType.TORPEDO)
	    				, new WaterWeapon("������", 20, WeaponType.ROCKET)
	    				, new WaterWeapon("�-300� \"����\" / \"����-�\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("48�6� / 48�6�2", 0, WeaponType.ZRK)
	    				, new WaterWeapon("4�33 \"���-� / ��\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("9�33� / ��", 0, WeaponType.ZRK)
	    				, new WaterWeapon("3�87 \"������\"", 0, WeaponType.ZRK)
	    				, new WaterWeapon("9�311", 0, WeaponType.ZRK)}
	    		);
		chapter.getUnitModel("11442").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "����� \"������� �������\""
				, "\"������� �������\" - ������� ������� �������� ������� ������� 11442"
				, new WaterTth(32, 0, 727, 140)
				, weapons
				, new WaterUnitSize(252, 28.5, 9.1, 26190)
				, UnitStatus.REPAIR
				, R.drawable.p11442_nahimov)
				);
		weapons = new WeaponList();
	    weapons.add(new WaterWeapon[]{
	    			  new WaterWeapon("��-130", 0, WeaponType.ARTILLERY)
	    			, new WaterWeapon("������", 20, WeaponType.ROCKET)
	    			, new WaterWeapon("���", 96, WeaponType.ZRK)
	    			, new WaterWeapon("������", 0, WeaponType.ZRK)
	    			, new WaterWeapon("3�87 \"������\"", 0, WeaponType.ZRK)
	    			, new WaterWeapon("���-6� \"�������\" 533 ��", 0, WeaponType.TORPEDO)
	    			, new WaterWeapon("�����-1 \"����-1�\"", 0, WeaponType.ANTITORPEDO)
	    			, new WaterWeapon("���-12000", 0, WeaponType.BOMB)
	    			, new WaterWeapon("���-1000 \"�����-3\"", 0, WeaponType.BOMB)}
	    		);
		chapter.getUnitModel("11442").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "����� \"���� �������\""
				, "\"���� �������\" - ������� ������� �������� ������� ������� 11442, ������� ��������� ����� ��� ��, ���������� � ���� ������������� ������� ������� (�� 2008 ���)." 
				, new WaterTth(31, 0, 655, 140)
				, weapons
				, new WaterUnitSize(251.1, 28.5, 10.3, 25860)
				, UnitStatus.AVAILABLE
				, R.drawable.p11442_petr_velikiy)
				);
		
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
						  new WaterWeapon("�-1000 \"������\"", 16, WeaponType.ROCKET)
						, new WaterWeapon("��-130", 2, WeaponType.ARTILLERY)
						, new WaterWeapon("��-630", 6, WeaponType.ARTILLERY)
						, new WaterWeapon("�-300� ���", 64, WeaponType.ZRK)
						, new WaterWeapon("\"���-��\"", 48, WeaponType.ZRK)
						, new WaterWeapon("533 ��", 0, WeaponType.TORPEDO)
						, new WaterWeapon("���-6000", 0, WeaponType.BOMB)}
				);
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "���� \"������\""
				, "\"������\" - �������� �������, �������� ������� ������� 1164 \"������\"" 
				, new WaterTth(32, 30, 510, 100)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 8.4, 11490)
				, UnitStatus.AVAILABLE
				, R.drawable.atlant_moskva)
				);

		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("�-500 \"�������\"", 16, WeaponType.ROCKET)
				, new WaterWeapon("��-130", 2, WeaponType.ARTILLERY)
				, new WaterWeapon("��-630", 6, WeaponType.ARTILLERY)
				, new WaterWeapon("�-300� ���", 64, WeaponType.ZRK)
				, new WaterWeapon("\"���-��\"", 48, WeaponType.ZRK)
				, new WaterWeapon("533 ��", 0, WeaponType.TORPEDO)
				, new WaterWeapon("���-6000", 0, WeaponType.BOMB)}
		);
		
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "���� \"�����\""
				, "\"������\" - �������� ������� ������� 1164 \"������\"" 
				, new WaterTth(32, 30, 480, 0)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 8.4, 11490)
				, UnitStatus.AVAILABLE
				, R.drawable.atlant_variag)
				);
		
		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("�-500 \"�������\"", 16, WeaponType.ROCKET)
				, new WaterWeapon("��-130", 2, WeaponType.ARTILLERY)
				, new WaterWeapon("��-630", 6, WeaponType.ARTILLERY)
				, new WaterWeapon("�-300� ���", 64, WeaponType.ZRK)
				, new WaterWeapon("\"���-��\"", 48, WeaponType.ZRK)
				, new WaterWeapon("533 ��", 10, WeaponType.TORPEDO)
				, new WaterWeapon("���-6000", 2, WeaponType.BOMB)}
		);
		
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "��� \"������ �������\""
				, "\"������ �������\" - �������� ������� ������� 1164" 
				, new WaterTth(32, 30, 476, 0)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 7.6, 11280)
				, UnitStatus.REPAIR
				, R.drawable.atlant_marshal_ustinov)
				);
		

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;
		
		chapter = new WaterChapter("� ��������������� �������� (�����)");
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
						  new WaterWeapon("533 ��", 0, WeaponType.TORPEDO)
						, new WaterWeapon("������", 12, WeaponType.BALLISTIC_ROCKET)}
				);				
		chapter.addUnitModel(new WaterUnitModel("955").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "������� �������� ��������� ������� ��������������� ���������� \"���� ����������\""
				, "������� �������� ��������� ������� ��������������� ���������� \"���� ����������\""
				, new WaterTth(29, 90, 107, 190)
				, weapons
				, new WaterUnitSize(160, 13.5, 10, 24000)
				, UnitStatus.AVAILABLE
				, R.drawable.submarine_borei_955_yuri_dolgorukii ))																		
				);

		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("533 ��", 0, WeaponType.TORPEDO)
				, new WaterWeapon("������", 16, WeaponType.BALLISTIC_ROCKET)}
		);				
		chapter.getUnitModel("955").addUnit(new WaterUnit(
			++WaterUnit.currentId
			, "������� �������� ��������� ������� ��������������� ���������� \"��������� �������\""
			, "\"��������� �������\" - ������� �������� ��������� ������� ��������������� ���������� ���������� ��������� ������� 955 \"�����\"."
			, new WaterTth(29, 90, 107, 190)
			, weapons
			, new WaterUnitSize(170, 13.5, 10, 24000 )
			, UnitStatus.BUILD
			, R.drawable.submarine_borei_955_aleksandr_nevskiy)																		
			);
		
		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("533 ��", 0, WeaponType.TORPEDO)
				, new WaterWeapon("������", 16, WeaponType.BALLISTIC_ROCKET)}
		);				
		chapter.getUnitModel("955").addUnit(new WaterUnit(
			++WaterUnit.currentId
			, "������� �������� ��������� ������� ��������������� ���������� \"�������� �������\""
			, "\"�������� �������\" - ������� �������� ��������� ������� ��������������� ���������� ���������� ��������� ������� 955 \"�����\"."
			, new WaterTth(29, 90, 107, 190)
			, weapons
			, new WaterUnitSize(170, 13.5, 10, 24000 )
			, UnitStatus.BUILD
			, R.drawable.submarine_borei_955_vladimir_monomah)																		
			);

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;

		chapter = new WaterChapter("� ��������� �������� (�����)");
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
							new WaterWeapon("533 ��", 10, WeaponType.TORPEDO)
						  , new WaterWeapon("650 ��", 10, WeaponType.TORPEDO)
						  , new WaterWeapon("�-100 \"�����\"", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("�-35", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("�-101", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("��-54�", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("��-54�1", 0, WeaponType.WING_ROCKET)
						  , new WaterWeapon("��-14�",0, WeaponType.WING_ROCKET)}
		);				
		chapter.addUnitModel(new WaterUnitModel("855").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "������������ ������� ��������� ����� � ��������� �������� \"������������\""
				, "\"������������\" - ������������ ������� ��������� ����� � ��������� ��������, �������� ������� ������� 855 \"�����\"."
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
