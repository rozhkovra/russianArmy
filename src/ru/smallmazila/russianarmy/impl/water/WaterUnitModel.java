package ru.smallmazila.russianarmy.impl.water;

import java.util.HashMap;
import java.util.Map;

import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;

public class WaterUnitModel implements UnitModel {
	protected String name;
	protected String shortName;	
	protected String shortDesc;
	protected Map<Long,Unit> units = new HashMap<Long, Unit>();
		
	public WaterUnitModel(String name) {
		super();
		this.name = name;
	}

	public WaterUnitModel(String name, String shortName, String shortDesc) {
		this(name);
		this.shortName = shortName;
		this.shortDesc = shortDesc;
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
		unit.setUnitModel(this);
		units.put(unit.getId(), unit);
		return this;
	}

	@Override
	public Map<Long,Unit> getUnits() {
		// TODO Auto-generated method stub
		return this.units;
	}

	public String getShortName() {
		return shortName;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	@Override
	public boolean logoView() {
		// TODO Auto-generated method stub
		for(Unit unit : units.values()){
			if(unit.getLogo()==null || "empty".equals(unit.getLogo()))
				return false;
		}
		return true;
	}


	
}
