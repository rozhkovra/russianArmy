package ru.smallmazila.russianarmy.model;

import java.util.Map;

public interface Chapter {
	public String getName();
	public Map<String, UnitModel> getUnitModels();
	public Chapter addUnitModel(UnitModel um);
	public UnitModel getUnitModel(String key);
}
