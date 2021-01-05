package type_6_interface;

public class Car extends CheckVehicle{

	public void run() {
		System.out.println("Car running.");
	}
	
	public static void main(String[] args) {

		Vehicle vehicle = new Car();
		vehicle.start();
		vehicle.run();
		
	}
}
