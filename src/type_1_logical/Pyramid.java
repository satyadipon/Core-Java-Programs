package type_1_logical;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createPyramid();

	}
	
	static void createPyramid()
	{
		for(int i=0;i<10;i++)
		{
			for (int j=10-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
			for(int j=0;j<=i;j++)
				System.out.println("*");
			System.out.println();
		}
	}
}
