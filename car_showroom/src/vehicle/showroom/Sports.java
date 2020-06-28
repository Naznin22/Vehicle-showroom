package vehicle.showroom;

import java.util.List;

public class Sports extends Vehicle {
	protected boolean turbo;
	//private String engine_type;
	public List<Sports> sports_vehicles;
	
	public Sports() {
		
	}
	
	public Sports(String type, int model_no, String engine_type, String engine_power, String tire_size, boolean turbo ) {
		super(type,model_no, engine_type,engine_power,tire_size);
		this.turbo = turbo;
//		this.engine_type = "Sports";
//		this.engine_type = "Oil";
	}
	
	public List<Sports> getSports_vehicles() {
		return sports_vehicles;
	}
	public void addSports_vehicles(Sports sports_vehicle) {
		sports_vehicles.add(sports_vehicle);
	}
	
	@Override
	public String toString() {
		return (super.toString()+" Turbo: " + turbo);
	}
	
}
