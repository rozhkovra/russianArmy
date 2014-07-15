package ru.smallmazila.russianarmy.data;

import java.util.HashMap;
import java.util.Map;

import ru.smallmazila.russianarmy.R;
import ru.smallmazila.russianarmy.impl.water.Flot;
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

public class MyData {
	public static Map<Long, Chapter> chapters = new HashMap<Long, Chapter>();

	public static void initAll(){
		initFlot();
		initAir();
		initEarth();
		initOther();
	}
	
	public static void initFlot(){
	    long id = 1L;	    
		Chapter chapter = new WaterChapter("��������� (��)")
				.addUnitModel(new WaterUnitModel("11435", "����", "������� ����������� �������"));
		Flot flot = new Flot("");
	    WeaponList weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("������", 12, WeaponType.ROCKET)
	    			  	, new WaterWeapon("����-1", 60, WeaponType.ROCKET)
	    				, new WaterWeapon("������", 192, WeaponType.ZRK)
	    				, new WaterWeapon("������", 256, WeaponType.ZRK)}
	    		);
		chapter.getUnitModel("11435").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "������� ����� ���������� ����� ��������"
				, "\"������� ����� ���������� ����� ��������\" - ������� ����������� ������� ������� 11435, ������������ ��������� ������."
				, new WaterTth(29, 45, 1960, 200000)
				, weapons
				, new WaterUnitSize(302.3, 72.3, 9.14, 43000)
				, UnitStatus.AVAILABLE
				, R.drawable.aircraft_carrier_kuznetsov
				, new Flot("�������� ����")
				,"063")
				);		
		MyData.chapters.put(Long.valueOf(id), chapter);
		
		id++;
		chapter = new WaterChapter("�������� ��������")
				.addUnitModel(new WaterUnitModel[]{
						  new WaterUnitModel("1144", "�����", "������� ������� �������� �������")
						, new WaterUnitModel("11442", "�����", "������� ������� �������� �������")
						, new WaterUnitModel("1164", "���", "�������� �������")}
				);
		weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				  new WaterWeapon("��-130", 1, WeaponType.ARTILLERY)
	    				, new WaterWeapon("��-630��", 8, WeaponType.ARTILLERY)
	    				, new WaterWeapon("�-700 \"������\"", 20, WeaponType.ROCKET)
	    				, new WaterWeapon("�-300� \"����\"", 96, WeaponType.ZRK)
	    				, new WaterWeapon("4�33 \"���-�\"", 40, WeaponType.ZRK)
			    		, new WaterWeapon("���-6000", 12, WeaponType.BOMB)
	    				, new WaterWeapon("���-1000 \"�����-3\"", 12, WeaponType.BOMB)
	    				, new WaterWeapon("��� \"�������-��\"", 20, WeaponType.TORPEDO)}
	    		);
		chapter.getUnitModel("1144").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "������� �������"
				, "\"������� �������\" - ������� ������� �������� ������� ������� 1144 \"�����\""
				, new WaterTth(31, 0, 727, 140000)
				, weapons
				, new WaterUnitSize(252, 28.5, 9.1, 26190)
				, UnitStatus.REPAIR
				, R.drawable.orlan_lazarev
				, new Flot("������������� ����")
				, "019")
				);
		weapons = new WeaponList()
	    		.add(new WaterWeapon[]{
	    				new WaterWeapon("��-130", 1, WeaponType.ARTILLERY)
	    				, new WaterWeapon("�-700 \"������\"", 20, WeaponType.ROCKET)  
	    				, new WaterWeapon("��� \"�������-��\"", 20, WeaponType.TORPEDO)
	    				, new WaterWeapon("���-12000", 10, WeaponType.BOMB)
	    				, new WaterWeapon("���-1000 \"�����-3\"", 12, WeaponType.BOMB)
	    				, new WaterWeapon("�-300� \"����\"", 96, WeaponType.ZRK)
	    				, new WaterWeapon("4�33 \"���-� / ��\"", 40, WeaponType.ZRK)
	    				, new WaterWeapon("3�87 \"������\"", 6, WeaponType.ZRK)}
	    		);
		chapter.getUnitModel("11442").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "������� �������"
				, "\"������� �������\" - ������� ������� �������� ������� ������� 11442"
				, new WaterTth(32, 0, 727, 140000)
				, weapons
				, new WaterUnitSize(252, 28.5, 9.1, 26190)
				, UnitStatus.REPAIR
				, R.drawable.p11442_nahimov
				, new Flot("�������� ����")
				, "080")
				);
		weapons = new WeaponList();
	    weapons.add(new WaterWeapon[]{
	    			  new WaterWeapon("��-130", 1, WeaponType.ARTILLERY)
	    			, new WaterWeapon("������", 20, WeaponType.ROCKET)
	    			, new WaterWeapon("�-300�", 48 , WeaponType.ZRK)
	    			, new WaterWeapon("�-300��", 46 , WeaponType.ZRK)
	    			, new WaterWeapon("������", 128, WeaponType.ZRK)
	    			, new WaterWeapon("3�87 \"������\"", 144, WeaponType.ZRK)
	    			, new WaterWeapon("���-6� \"�������\" 533 ��", 20, WeaponType.TORPEDO)
	    			, new WaterWeapon("�����-1 \"����-1�\"", 40, WeaponType.ANTITORPEDO)
	    			, new WaterWeapon("���-12000", 1, WeaponType.BOMB)
	    			, new WaterWeapon("���-1000 \"�����-3\"", 2, WeaponType.BOMB)}
	    		);
		chapter.getUnitModel("11442").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "���� �������"
				, "\"���� �������\" - ������� ������� �������� ������� ������� 11442, ������� ��������� ����� ��� ��, ���������� � ���� ������������� ������� ������� (�� 2008 ���)." 
				, new WaterTth(31, 0, 655, 140000)
				, weapons
				, new WaterUnitSize(251.1, 28.5, 10.3, 25860)
				, UnitStatus.AVAILABLE
				, R.drawable.p11442_petr_velikiy
				, new Flot("�������� ����")
				, "099")
				);
		
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
						  new WaterWeapon("�-1000 \"������\"", 16, WeaponType.ROCKET)
						, new WaterWeapon("��-130", 2, WeaponType.ARTILLERY)
						, new WaterWeapon("��-630", 6, WeaponType.ARTILLERY)
						, new WaterWeapon("�-300� ���", 64, WeaponType.ZRK)
						, new WaterWeapon("\"���-��\"", 48, WeaponType.ZRK)
						, new WaterWeapon("533 ��", 2, WeaponType.TORPEDO)
						, new WaterWeapon("���-6000", 2, WeaponType.BOMB)}
				);
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "������"
				, "\"������\" - �������� �������, �������� ������� ������� 1164 \"������\"" 
				, new WaterTth(32, 30, 510, 100000)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 8.4, 11490)
				, UnitStatus.AVAILABLE
				, R.drawable.atlant_moskva
				, new Flot("������������ ����")
				, "121")
				);

		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("�-500 \"�������\"", 16, WeaponType.ROCKET)
				, new WaterWeapon("��-130", 2, WeaponType.ARTILLERY)
				, new WaterWeapon("��-630", 6, WeaponType.ARTILLERY)
				, new WaterWeapon("�-300� ���", 64, WeaponType.ZRK)
				, new WaterWeapon("\"���-��\"", 48, WeaponType.ZRK)
				, new WaterWeapon("533 ��", 2, WeaponType.TORPEDO)
				, new WaterWeapon("���-6000", 2, WeaponType.BOMB)}
		);
		
		chapter.getUnitModel("1164").addUnit(new WaterUnit(++WaterUnit.currentId
				, "�����"
				, "\"������\" - �������� ������� ������� 1164 \"������\"" 
				, new WaterTth(32, 30, 480, 100000)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 8.4, 11490)
				, UnitStatus.AVAILABLE
				, R.drawable.atlant_variag
				, new Flot("������������� ����")
				, "011")
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
				, "������ �������"
				, "\"������ �������\" - �������� ������� ������� 1164" 
				, new WaterTth(32, 30, 476, 100000)
				, weapons
				, new WaterUnitSize(186.4, 20.8, 7.6, 11280)
				, UnitStatus.REPAIR
				, R.drawable.atlant_marshal_ustinov
				, new Flot("�������� ����")
				, "055")
				);
		

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;
		
		chapter = new WaterChapter("� ��������������� �������� (�����)");
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
						  new WaterWeapon("533 ��", 6, WeaponType.TORPEDO)
						, new WaterWeapon("������", 12, WeaponType.BALLISTIC_ROCKET)}
				);				
		chapter.addUnitModel(new WaterUnitModel("955", "����C�", "������� �������� ��������� ������� ��������������� ����������").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "���� ����������"
				, "������� �������� ��������� ������� ��������������� ���������� \"���� ����������\""
				, new WaterTth(29, 90, 107, 250000)
				, weapons
				, new WaterUnitSize(160, 13.5, 10, 24000)
				, UnitStatus.AVAILABLE
				, R.drawable.submarine_borei_955_yuri_dolgorukii
				, new Flot("�������� ����")
				, "�-535"))																		
				);

		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("533 ��", 6, WeaponType.TORPEDO)
				, new WaterWeapon("������", 16, WeaponType.BALLISTIC_ROCKET)}
		);				
		chapter.getUnitModel("955").addUnit(new WaterUnit(
			++WaterUnit.currentId
			, "��������� �������"
			, "\"��������� �������\" - ������� �������� ��������� ������� ��������������� ���������� ���������� ��������� ������� 955 \"�����\"."
			, new WaterTth(29, 90, 107, 250000)
			, weapons
			, new WaterUnitSize(170, 13.5, 10, 24000 )
			, UnitStatus.BUILD
			, R.drawable.submarine_borei_955_aleksandr_nevskiy
			, flot
			, "�-550")																		
			);
		
		weapons = new WeaponList()
			.add(new WaterWeapon[]{
				  new WaterWeapon("533 ��", 6, WeaponType.TORPEDO)
				, new WaterWeapon("������", 16, WeaponType.BALLISTIC_ROCKET)}
		);				
		chapter.getUnitModel("955").addUnit(new WaterUnit(
			++WaterUnit.currentId
			, "�������� �������"
			, "\"�������� �������\" - ������� �������� ��������� ������� ��������������� ���������� ���������� ��������� ������� 955 \"�����\"."
			, new WaterTth(29, 90, 107, 250000)
			, weapons
			, new WaterUnitSize(170, 13.5, 10, 24000 )
			, UnitStatus.BUILD
			, R.drawable.submarine_borei_955_vladimir_monomah
			, flot
			, "�-551")																		
			);

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;

		chapter = new WaterChapter("� ��������� �������� (�����)");
		weapons = new WeaponList()
				.add(new WaterWeapon[]{
							new WaterWeapon("533 ��", 10, WeaponType.TORPEDO)
						  , new WaterWeapon("650 ��", 10, WeaponType.TORPEDO)
						  , new WaterWeapon("�-100 \"�����\"", 24, WeaponType.WING_ROCKET)
						  , new WaterWeapon("�-35", 24, WeaponType.WING_ROCKET)
						  , new WaterWeapon("�-101", 24, WeaponType.WING_ROCKET)
						  , new WaterWeapon("��-54�", 24, WeaponType.WING_ROCKET)
						  , new WaterWeapon("��-54�1", 24, WeaponType.WING_ROCKET)
						  , new WaterWeapon("��-14�",24, WeaponType.WING_ROCKET)}
		);				
		chapter.addUnitModel(new WaterUnitModel("885", "����", "������������ ������� ��������� ����� � ��������� ��������").addUnit(new WaterUnit(
				++WaterUnit.currentId
				, "������������"
				, "\"������������\" - ������������ ������� ��������� ����� � ��������� ��������, �������� ������� ������� 885 \"�����\"."
				, new WaterTth(31, 100, 90, 0)
				, weapons
				, new WaterUnitSize(119, 13.5, 9.4, 13800)
				, UnitStatus.AVAILABLE
				, R.drawable.submarine_yasen_885_severodvinsk
				, flot
				, "�-560"))																		
				);

		MyData.chapters.put(Long.valueOf(id), chapter);
		id++;

	}
	
	public static void initAir(){
	}

	public static void initEarth(){
	}
	public static void initOther(){
	}

}
