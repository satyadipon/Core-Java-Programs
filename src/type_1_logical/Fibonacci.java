package type_1_logical;

public class Fibonacci {

	public static void main(String[] args) {

		printFibonacciSeries(10);

	}
	
	static void printFibonacciSeries(int input) {
		
		int n1=0,n2=1,temp;

		for(int i=0;i<input;i++)
		{
			if(i==0)
				System.out.print(n1+ " ");
			else if(i==1)
				System.out.print(n2+ " ");
			else {
				
				temp = n1+n2;
				System.out.print(temp+ " ");
				
				n1 = n2;
				n2 = temp;
				
			}
			
		}
		
	}

}
