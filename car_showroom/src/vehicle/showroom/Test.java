package vehicle.showroom;

import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		Vehicle sports_vehicle = new Sports("Sports",1,"","223","L",true);
		Vehicle heavy_vehicle = new Heavy("Heavy",2,"","224","XL","50kilo");
		Vehicle vehicle = new Vehicle("Normal",3,"normal","225","M");
//		System.out.println(sports_vehicle.toString());
//		System.out.println(heavy_vehicle.toString());
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		Showroom showroom = new Showroom(vehicles);
		
		showroom.addVehicle(heavy_vehicle);
		showroom.addVehicle(sports_vehicle);
		showroom.addVehicle(vehicle);
		System.out.println(showroom.getVehicles());
		System.out.println(showroom.getCount());
		
	}
}
 