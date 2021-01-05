package type_5_abstract;

public class Car extends Vehicle{

	void run() {
		System.out.println("Car running.");
	}
	
	public static void main(String[] args) {

		Vehicle vehicle = new Car();
		vehicle.start();
		vehicle.run();
		
	}
}
