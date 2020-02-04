package codes;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFactorial(6);

	}
	
	static void getFactorial(int input) {
		
		int factorial=1;
		
		for(int i=input;i>0;i--)
			factorial=factorial*i;
		
		System.out.println(factorial);
		
	}

}
