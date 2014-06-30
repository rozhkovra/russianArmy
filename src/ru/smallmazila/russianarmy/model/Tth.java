package ru.smallmazila.russianarmy.model;

import java.util.HashMap;
import java.util.Map;

public abstract class Tth {
	protected Map<String, Object> characteristics = new HashMap<String, Object>();
	
	public Object getCharacter(String key){
		return this.characteristics.get(key);
	}
	
	public void addChaaracter(String key, Object value){
		this.characteristics.put(key, value);
	}
}
