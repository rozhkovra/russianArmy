package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.UnitSize;
import ru.smallmazila.russianarmy.vacabulary.Mesure;

public class WaterUnitSize extends UnitSize {
	public WaterUnitSize(){
		sizes.put("Длина",0.0);
		sizes.put("Ширина",0.0);
		sizes.put("Осадка",0.0);
		sizes.put("Водоиз-е",0);
	}

	public WaterUnitSize(double l, double w, double h, int toWater){
		sizes.put("Длина",l);
		sizes.put("Ширина",w);
		sizes.put("Осадка",h);
		sizes.put("Водоиз-е",toWater);
	}
	
	@Override
	public String toString(){
		String str = "";
		for(String s : sizes.keySet()){
			str+=s+": "+sizes.get(s)+" "+Mesure.unitMesure.get(s)+"\n";
		}
		return str;
	}
}
