package ru.smallmazila.russianarmy.vacabulary;

import java.util.HashMap;

public class WeaponVac {
	public static HashMap<WeaponType,String> types = new HashMap<WeaponType,String>(){{
		put(WeaponType.ROCKET,"������");
		put(WeaponType.ZRK,"���");
		put(WeaponType.ARTILLERY,"�������������� ���������");
		put(WeaponType.TORPEDO,"�������");
		put(WeaponType.ANTITORPEDO,"��������������");
		put(WeaponType.BOMB,"����������� ��������� ");
		put(WeaponType.BALLISTIC_ROCKET, "�������������� ������");
		put(WeaponType.WING_ROCKET, "�������� ������");
	}};
}
