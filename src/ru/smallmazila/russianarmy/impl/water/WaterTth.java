package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.vacabulary.Mesure;

public class WaterTth extends Tth {
	public WaterTth(){
		characteristics.put("Скорость",0);
		characteristics.put("Автон-ть",0);
		characteristics.put("Экипаж",0);		
		characteristics.put("Мощность",0);
	};
	
	public WaterTth(int v, int a, int people, int power){
		characteristics.put("Скорость",v);
		characteristics.put("Автон-ть",a);
		characteristics.put("Экипаж",people);		
		characteristics.put("Мощность",power);		
	}
	
	@Override
	public String toString(){
		String str = "";
		for(String s : characteristics.keySet()){
			str+=s+": "+characteristics.get(s)+" "+Mesure.unitMesure.get(s)+"\n";
		}
		return str;
	}
}
