package ru.smallmazila.russianarmy.model;

import java.util.ArrayList;

public class WeaponList {
	public ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	
	public WeaponList add(Weapon weapon){
		weapons.add(weapon);
		return this;
	}
	
	public WeaponList add(Weapon[] weapons){
		for(Weapon weapon : weapons)
			this.add(weapon);
		return this;
	}
}
