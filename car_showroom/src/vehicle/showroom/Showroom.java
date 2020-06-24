package vehicle.showroom;

import java.util.List;

public class Showroom {
	private List<Vehicle> vehicles;
	private int total_count = 30;
	
	public Showroom(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
//		total_count = vehicles.size();
	}
	
	//return list of vehicles
	public List<Vehicle> getVehicles(){
		return vehicles;
	}
	
	//adds a vehicle to the showroom
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		if(vehicle.type == "Sports") total_count+=20;
	}
	
	//return total counts of vehicles
	public int getCount() {
		return total_count;
	}
	public void updateCount(int count) {
		total_count+=count;
	}
}
