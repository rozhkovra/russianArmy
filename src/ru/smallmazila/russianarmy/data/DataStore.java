package ru.smallmazila.russianarmy.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import ru.smallmazila.russianarmy.impl.water.Flot;
import ru.smallmazila.russianarmy.impl.water.WaterChapter;
import ru.smallmazila.russianarmy.impl.water.WaterTth;
import ru.smallmazila.russianarmy.impl.water.WaterUnit;
import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;
import ru.smallmazila.russianarmy.impl.water.WaterUnitSize;
import ru.smallmazila.russianarmy.impl.water.WaterWeapon;
import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.model.UnitModel;
import ru.smallmazila.russianarmy.model.UnitSize;
import ru.smallmazila.russianarmy.model.WeaponList;
import ru.smallmazila.russianarmy.vacabulary.UnitStatus;
import ru.smallmazila.russianarmy.vacabulary.WeaponType;
import android.content.res.AssetManager;

public class DataStore {
	private static long id = 1L;
	public static HashMap<String,WeaponType> convertWeaponType = new HashMap<String, WeaponType>(){{
		put("ROCKET",WeaponType.ROCKET);
		put("ZRK",WeaponType.ZRK);
		put("ARTILLERY",WeaponType.ARTILLERY);
		put("TORPEDO",WeaponType.TORPEDO);
		put("ANTITORPEDO",WeaponType.ANTITORPEDO);
		put("BOMB",WeaponType.BOMB);
		put("BALLISTIC_ROCKET",WeaponType.BALLISTIC_ROCKET);
		put("WING_ROCKET",WeaponType.WING_ROCKET);
		
	}};
	public static HashMap<String,UnitStatus> convertUnitStatus = new HashMap<String, UnitStatus>(){{
		put("REPAIR",UnitStatus.REPAIR);
		put("AVAILABLE",UnitStatus.AVAILABLE);
		put("BUILD",UnitStatus.BUILD);		
	}};
	public static Map<Long, Chapter> chapters = new HashMap<Long, Chapter>();

	public static void initAll(AssetManager am){
		initFlot(am);
		initAir(am);
		initEarth(am);
		initOther(am);
	}
	
	public static void initFlot(AssetManager assetManager){
		try{			
			chapters = DataStore.load(assetManager,"water.txt");
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}
	
	public static void initAir(AssetManager assetManager){
	}

	public static void initEarth(AssetManager assetManager){
	}
	public static void initOther(AssetManager assetManager){
	}	
	public DataStore(AssetManager assetManager){		
	}
	
	public static Map<Long, Chapter> load(AssetManager assetManager, String filename) throws IOException{
		Map<Long, Chapter> chapters = new HashMap<Long, Chapter>();
		BufferedReader in = new BufferedReader(new InputStreamReader(assetManager.open(filename), "cp1251"));
		String s = "";
		Chapter chapter = null;
		UnitModel unitModel = null;
		WeaponList weapons = new WeaponList();
		Tth tth = null;
		UnitSize unitSize = null;
		while((s = in.readLine())!=null){
			s = s.trim();
			if("Chapter".equals(s)){
				chapter = new WaterChapter(in.readLine());
				chapters.put(id++, chapter);
			}else if("UnitModel".equals(s)){
				unitModel = new WaterUnitModel(in.readLine(),in.readLine(), in.readLine());
				chapter.addUnitModel(unitModel);
			}else if("Weapons".equals(s)){
				weapons = new WeaponList();
			}else if("Weapon".equals(s)){
				weapons.add(new WaterWeapon(in.readLine(), Integer.valueOf(in.readLine()), convertWeaponType.get(in.readLine())));
			}else if("Tth".equals(s)){
				tth = new WaterTth(Integer.valueOf(in.readLine()), Integer.valueOf(in.readLine()), Integer.valueOf(in.readLine()), Integer.valueOf(in.readLine()));
			}else if("UnitSize".equals(s)){
				unitSize = new WaterUnitSize(Double.valueOf(in.readLine()), Double.valueOf(in.readLine()), Double.valueOf(in.readLine()), Integer.valueOf(in.readLine()));
			}else if("Unit".equals(s)){
				unitModel.addUnit(new WaterUnit(
						++WaterUnit.currentId
						, in.readLine()
						, in.readLine()
						, tth
						, weapons
						, unitSize
						, convertUnitStatus.get(in.readLine())
						, in.readLine()
						, new Flot(in.readLine())
						, in.readLine()
						, in.readLine()
						, in.readLine())
				);
			}
		}
		in.close();
		return chapters;
	}
}
