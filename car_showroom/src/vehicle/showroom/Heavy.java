package vehicle.showroom;

import java.util.List;

public class Heavy extends Vehicle {
	protected String weight;
	public List<Heavy> heavy_vehicles;
	
	public Heavy(String type, int model_no, String engine_type, String engine_power, String tire_size, String weight ) {
		super(type, model_no, engine_type,engine_power,tire_size);
		this.weight = weight;
		this.type = "Heavy";
		this.engine_type = "Diesel";
	}
	
	public List<Heavy> getHeavy_vehicles() {
		return heavy_vehicles;
	}
	public void addHeavy_vehicles(Heavy heavy_vehicle) {
		heavy_vehicles.add(heavy_vehicle);
	}
	
	@Override
	public String toString() {
		return (super.toString()+ weight);
	}
	
}
