package vehicle.showroom;

import java.util.List;

public class Vehicle {
	protected String type;
	protected int model_no;
	protected String engine_type;
	protected String engine_power;
	protected String tire_size;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String type,int model_no, String engine_type, String engine_power, String tire_size) {
		this.type = type;
		this. model_no = model_no;
		this. engine_type = engine_type;
		this. engine_power = engine_power;
		this.tire_size =  tire_size;
	}
	
	
	
	public String toString() {
		return ("Type: "+type+" Model: "+model_no+" Engine type: "+engine_type+
				" Engine power: "+engine_power+" Tire_size: "+tire_size);
	}
}
