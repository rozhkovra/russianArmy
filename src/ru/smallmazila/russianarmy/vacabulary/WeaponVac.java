package ru.smallmazila.russianarmy.vacabulary;

import java.util.HashMap;

public class WeaponVac {
	public static HashMap<WeaponType,String> types = new HashMap<WeaponType,String>(){{
		put(WeaponType.ROCKET,"Ракеты");
		put(WeaponType.ZRK,"ЗРК");
		put(WeaponType.ARTILLERY,"Артиллерийская установка");
		put(WeaponType.TORPEDO,"Торпеды");
		put(WeaponType.ANTITORPEDO,"Противоторпеды");
		put(WeaponType.BOMB,"Бомбометные установки ");
		put(WeaponType.BALLISTIC_ROCKET, "Баллистические ракеты");
		put(WeaponType.WING_ROCKET, "Крылатые ракеты");
	}};
}
