package ru.smallmazila.russianarmy.impl.water;

import java.util.List;

import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;
import ru.smallmazila.russianarmy.model.UnitSize;
import ru.smallmazila.russianarmy.model.Weapon;
import ru.smallmazila.russianarmy.model.WeaponList;
import ru.smallmazila.russianarmy.vacabulary.UnitStatus;

public class WaterUnit implements Unit {
	public static long currentId = 0;
	private long id;
	protected String title;
	protected String description;
	protected Tth tth;
	protected WeaponList weapons;
	protected UnitSize size;
	protected UnitStatus status;
	protected int image;
	protected UnitModel unitModel;
		
	public WaterUnit(long id, String title, String description, Tth tth,
			WeaponList weapons, UnitSize size, UnitStatus status, int image) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tth = tth;
		this.weapons = weapons;
		this.size = size;
		this.status = status;
		this.image = image;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public Tth getTth() {
		// TODO Auto-generated method stub
		return tth;
	}

	@Override
	public List<Weapon> getWeapons() {
		// TODO Auto-generated method stub
		return weapons.weapons;
	}

	@Override
	public UnitSize getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public void setUnitModel(UnitModel um) {
		// TODO Auto-generated method stub
		this.unitModel = um;
	}

	public UnitModel getUnitModel() {
		return unitModel;
	}

	public UnitStatus getStatus() {
		return status;
	}

	public void setStatus(UnitStatus status) {
		this.status = status;
	}
	
	
	
}
