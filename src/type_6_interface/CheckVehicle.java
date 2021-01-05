package type_6_interface;

abstract class CheckVehicle implements Vehicle {
	
	CheckVehicle(){
		System.out.println("Vehicle is ready");
	}
	
	public void start() {
		System.out.println("Vehicle started");
	}
	

}
