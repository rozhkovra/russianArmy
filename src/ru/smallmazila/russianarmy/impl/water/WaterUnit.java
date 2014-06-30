package ru.smallmazila.russianarmy.impl.water;

import java.util.List;

import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;
import ru.smallmazila.russianarmy.model.UnitSize;
import ru.smallmazila.russianarmy.model.Weapon;

public class WaterUnit implements Unit {
	private long id;
	protected String title;
	protected String description;
	protected Tth tth;
	protected List<Weapon> weapons;
	protected UnitSize size;	
	protected int image;
	protected UnitModel unitModel;
		
	public WaterUnit(long id, String title, String description, Tth tth,
			List<Weapon> weapons, UnitSize size, int image) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tth = tth;
		this.weapons = weapons;
		this.size = size;
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
		return weapons;
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
	
	

}
