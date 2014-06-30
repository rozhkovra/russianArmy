package ru.smallmazila.russianarmy.model;

import ru.smallmazila.russianarmy.vacabulary.WeaponType;

public interface Weapon {
	public String getName();
	public WeaponType type();
	public int getCount();
}
