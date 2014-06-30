package ru.smallmazila.russianarmy.util;

import java.util.List;

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
}
