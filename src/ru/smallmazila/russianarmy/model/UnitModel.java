package ru.smallmazila.russianarmy.model;

import java.util.Map;

import ru.smallmazila.russianarmy.impl.water.WaterUnitModel;

public interface UnitModel {
	public String getName();
	public Unit getUnit(long id);
	public WaterUnitModel addUnit(Unit unit);
	public Map<Long,Unit> getUnits();	
}
