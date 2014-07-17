package ru.smallmazila.russianarmy.impl.water;

import java.util.List;

import android.content.res.AssetFileDescriptor;
import ru.smallmazila.russianarmy.model.Tth;
import ru.smallmazila.russianarmy.model.Unit;
import ru.smallmazila.russianarmy.model.UnitModel;
import ru.smallmazila.russianarmy.model.UnitSize;
import ru.smallmazila.russianarmy.model.Weapon;
import ru.smallmazila.russianarmy.model.WeaponList;
import ru.smallmazila.russianarmy.vacabulary.UnitStatus;

public class WaterUnit implements Unit {
	public static long currentId = 0;
	private long id;
	protected String title;
	protected String description;
	protected Tth tth;
	protected WeaponList weapons;
	protected UnitSize size;
	protected UnitStatus status;
	protected String image;
	protected UnitModel unitModel;
	protected Flot flot;
	protected String number;
	protected String logo;
		
	public WaterUnit(long id, String title, String description, Tth tth,
			WeaponList weapons, UnitSize size, UnitStatus status, String image
			, Flot flot, String number, String logo) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tth = tth;
		this.weapons = weapons;
		this.size = size;
		this.status = status;
		this.image = image;
		this.flot = flot;
		this.number = number;
		this.logo = logo;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public Tth getTth() {
		// TODO Auto-generated method stub
		return tth;
	}

	@Override
	public List<Weapon> getWeapons() {
		// TODO Auto-generated method stub
		return weapons.weapons;
	}

	@Override
	public UnitSize getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public void setUnitModel(UnitModel um) {
		// TODO Auto-generated method stub
		this.unitModel = um;
	}

	public UnitModel getUnitModel() {
		return unitModel;
	}

	public UnitStatus getStatus() {
		return status;
	}

	public void setStatus(UnitStatus status) {
		this.status = status;
	}

	public Flot getFlot() {
		return flot;
	}

	public void setFlot(Flot flot) {
		this.flot = flot;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLogo() {
		if(!"empty".equals(logo))			
			return logo;
		else
			return image;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
}
