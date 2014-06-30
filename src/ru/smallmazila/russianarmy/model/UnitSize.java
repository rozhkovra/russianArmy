package ru.smallmazila.russianarmy.model;

import java.util.HashMap;
import java.util.Map;

public abstract class UnitSize {
	protected Map<String, Object> sizes = new HashMap<String, Object>();
	
	public Object getSize(String key){
		return this.sizes.get(key);
	}
	
	public void addSize(String key, Object value){
		this.sizes.put(key, value);
	}
}
