package vehicle.showroom;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		String type="";
		int model;
		String engine_type="";
		String engine_power="";
		String tire_size="";
		boolean turbo = false;
		String weight = "0";
		
		List<Vehicle> vehicles = new ArrayList<>();
		Showroom showroom = new Showroom(vehicles);
		Vehicle vehicle = new Vehicle();
		
		
		Scanner scan  = new Scanner(System.in);
		
		String add;
		while(true) {
		System.out.println("Wanna add?");
		add = scan.nextLine();
		
		if(add.equals("Yes")) {
			System.out.println("Enter Vehicle type: ");
			type = scan.nextLine();
			System.out.println("Enter model no: ");
			model = scan.nextInt();
			scan.nextLine();
			if(type.equals("Normal")) {
				System.out.println("Enter engine type: ");
				engine_type = scan.nextLine();
			}
			System.out.println("Enter engine power: ");
			engine_power = scan.nextLine();
			System.out.println("Enter tire size");
			tire_size = scan.nextLine();
			
			if(type.equals("Sports")) {
				System.out.println("Enter turbo: ");
				turbo = scan.hasNext("True");
				scan.nextLine();
				vehicle = new Sports("Sports",model,"Oil",engine_power,
									tire_size,turbo);
				showroom.addVehicle(vehicle);
				System.out.println(showroom.getVehicles());
			}
			else if (type.equals("Heavy")) {
				System.out.println("Enter weight: ");
				weight = scan.nextLine();
				vehicle = new Heavy("Heavy",model,"Diesel",engine_power,
						tire_size,weight);
				showroom.addVehicle(vehicle);
				System.out.println(showroom.getVehicles());
			}
			
			else {
			
				vehicle = new Vehicle(type,model,engine_type,engine_power,tire_size);
				showroom.addVehicle(vehicle);
				System.out.println(showroom.getVehicles());
			}
		} else break;
		}
		
		System.out.println(showroom.getVehicles());
		System.out.println(showroom.getCount());
		
		String remove;
		System.out.println("Remove a vehicle?");
		remove = scan.nextLine();
		
		if(remove.equals("Yes")) {
			System.out.println("Enter Model: ");
			int model_no = scan.nextInt();
			scan.nextLine();
			showroom.removeVehicle(model_no);
			System.out.println(showroom.getVehicles());
		}else {
			System.out.println(showroom.getVehicles());
		}
		
		
	}
}
 