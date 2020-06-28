package vehicle.showroom;

import java.util.List;

public class Showroom {
	private List<Vehicle> vehicles;
	private int total_count = 30;
	
	public Showroom() {
		
	}
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
		if(vehicle.type.equals("Sports")) total_count+=20;
	}
	
	public void removeVehicle(int model_no) {
		vehicles.removeIf(vehicle -> vehicle.model_no == model_no);
	}
	
	//return total counts of vehicles
	public int getCount() {
		System.out.println("Current Expected Visitors: ");
		return total_count;
	}
	public void updateCount(int count) {
		total_count+=count;
	}
}
