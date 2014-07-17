package ru.smallmazila.russianarmy.util;

import java.util.List;

import ru.smallmazila.russianarmy.data.DataStore;
import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;
import ru.smallmazila.russianarmy.model.Weapon;
import ru.smallmazila.russianarmy.vacabulary.WeaponVac;

public class Util {
	public static String weapons(List<Weapon> list, String delimiter){
		String s = "";
		for(Weapon weapon : list){
			s += WeaponVac.types.get(weapon.type())+" "+weapon.getName()+" ("+weapon.getCount()+")"+delimiter;
		}
		return s;
	}
	
	public static Unit findUnitById(long id){
		Unit unit = null;
		for(Chapter chapter : DataStore.chapters.values()){
			for(UnitModel um : chapter.getUnitModels().values()){
				unit = um.getUnit(id);
				if(unit!=null)
					return unit;
			}			
		}
		return unit;
	}
	
	public static String getPower(int val){
		if(val / 1000 > 1)
			return val/1000 + " т.";
		else
			return val+"";
	}

	public static String getAutonomy(int a) {
		return (a==0)?"автономен":a+"";
	}
}
