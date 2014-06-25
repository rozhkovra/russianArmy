package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.Unit;

public class WaterUnit implements Unit {
	private long id;
	protected String title;
	protected String description;
	protected String tth;
	protected String weapons;
	protected String size;	
	protected int image;
		
	public WaterUnit(long id, String title, String description, String tth,
			String weapons, String size, int image) {
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
	public String getTth() {
		// TODO Auto-generated method stub
		return tth;
	}

	@Override
	public String getWeapons() {
		// TODO Auto-generated method stub
		return weapons;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int getImage() {
		// TODO Auto-generated method stub
		return image;
	}

}
