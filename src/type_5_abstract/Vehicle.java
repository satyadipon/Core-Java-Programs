package type_5_abstract;

public abstract class Vehicle {
	
	Vehicle(){
		System.out.println("Vehicle is ready!");
	}
	
	void start() {
		System.out.println("Vehicle started");
	}
	
	abstract void run();
}
