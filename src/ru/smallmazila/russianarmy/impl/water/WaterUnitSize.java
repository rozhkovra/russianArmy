package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.UnitSize;
import ru.smallmazila.russianarmy.vacabulary.Mesure;

public class WaterUnitSize extends UnitSize {
	public WaterUnitSize(){
		sizes.put("�����",0.0);
		sizes.put("������",0.0);
		sizes.put("������",0.0);
		sizes.put("������-�",0);
	}

	public WaterUnitSize(double l, double w, double h, int toWater){
		sizes.put("�����",l);
		sizes.put("������",w);
		sizes.put("������",h);
		sizes.put("������-�",toWater);
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
