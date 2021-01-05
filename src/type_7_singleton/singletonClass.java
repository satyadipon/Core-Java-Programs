package type_7_singleton;

public class singletonClass {
	
	private singletonClass() {
		
		System.out.println("singletonClass object created");
		
	}
	
	private static singletonClass singletonClassObject = null;
	
	public static singletonClass getObject() {
		
		if(singletonClassObject == null)
			singletonClassObject = new singletonClass();
		
		return singletonClassObject;
		
	}

}
