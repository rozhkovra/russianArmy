package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.Weapon;
import ru.smallmazila.russianarmy.vacabulary.WeaponType;

public class WaterWeapon implements Weapon{
	protected String name;
	protected int count;
	protected WeaponType type;
	
	public WaterWeapon(String name, int count, WeaponType type) {
		super();
		this.name = name;
		this.count = count;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	@Override
	public WeaponType type() {
		// TODO Auto-generated method stub
		return type;
	}
	
}
