package ru.smallmazila.russianarmy.impl.water;

import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.util.Util;
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
		characteristics.put("�����-��",Util.getAutonomy(a));
		characteristics.put("������",people);		
		characteristics.put("��������",Util.getPower(power));		
	}
	
	@Override
	public String toString(){
		String str = "";
		for(String s : characteristics.keySet()){
			str+=s+": "+characteristics.get(s)+" "+("���������".equals(characteristics.get(s))?"":Mesure.unitMesure.get(s))+"\n";
		}
		return str;
	}
}
