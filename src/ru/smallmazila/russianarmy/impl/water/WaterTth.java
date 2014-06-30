package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.vacabulary.Mesure;

public class WaterTth extends Tth {
	public WaterTth(){
		characteristics.put("��������",0);
		characteristics.put("�����-��",0);
		characteristics.put("������",0);		
		characteristics.put("��������",0);
	};
	
	public WaterTth(int v, int a, int people, int power){
		characteristics.put("��������",v);
		characteristics.put("�����-��",a);
		characteristics.put("������",people);		
		characteristics.put("��������",power);		
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
