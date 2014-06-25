package ru.smallmazila.russianarmy.impl.water;

import java.util.HashMap;
import java.util.Map;

import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;

public class WaterUnitModel implements UnitModel {
	protected String name;
	protected Map<Long,Unit> units = new HashMap<Long, Unit>();
		
	public WaterUnitModel(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Unit getUnit(long id) {
		// TODO Auto-generated method stub
		if(units.containsKey(id))
			return units.get(id);
		return null;
	}

	@Override
	public WaterUnitModel addUnit(Unit unit) {
		// TODO Auto-generated method stub
		units.put(unit.getId(), unit);
		return this;
	}

}
