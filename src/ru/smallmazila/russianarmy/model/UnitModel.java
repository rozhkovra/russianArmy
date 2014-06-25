package ru.smallmazila.russianarmy.model;

import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;

public interface UnitModel {
	public String getName();
	public Unit getUnit(long id);
	public WaterUnitModel addUnit(Unit unit);	
}
