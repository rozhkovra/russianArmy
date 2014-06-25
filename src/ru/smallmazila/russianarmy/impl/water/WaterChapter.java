package ru.smallmazila.russianarmy.impl.water;

import java.util.HashMap;
import java.util.Map;

import ru.smallmazila.russianarmy.model.Chapter;
import ru.smallmazila.russianarmy.model.UnitModel;

public class WaterChapter implements Chapter {
	protected String name;
	protected Map<String, UnitModel> unitModels = new HashMap<String, UnitModel>();
	
	
	
	public WaterChapter(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Map<String, UnitModel> getUnitModels() {
		// TODO Auto-generated method stub
		return unitModels;
	}

	@Override
	public WaterChapter addUnitModel(UnitModel um) {
		// TODO Auto-generated method stub
		unitModels.put(um.getName(),um);
		return this;
	}

}
