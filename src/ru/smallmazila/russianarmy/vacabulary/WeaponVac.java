package ru.smallmazila.russianarmy.vacabulary;

import java.util.HashMap;

public class WeaponVac {
	public static HashMap<WeaponType,String> types = new HashMap<WeaponType,String>(){{
		put(WeaponType.ROCKET,"Ракеты");
		put(WeaponType.ZRK,"ЗРК");
	}};
}
