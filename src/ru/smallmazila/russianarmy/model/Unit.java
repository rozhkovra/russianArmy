package ru.smallmazila.russianarmy.model;

import java.util.List;

import ru.smallmazila.russianarmy.vacabulary.UnitStatus;

public interface Unit {	
	public long getId();
	public String getTitle();
	public String getDescription();
	public Tth getTth();
	public List<Weapon> getWeapons();
	public UnitSize getSize();
	public int getImage();
	public void setUnitModel(UnitModel um);
	public UnitModel getUnitModel();
	public UnitStatus getStatus();
}
