package type_1_logical;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrong(153);
	}
	
	static void isArmstrong(int input)
	{
		int tempInput = input;
		int temp=0,c;
		
		while(input>0)
		{
			c = input%10;
			temp = (c*c*c)+temp;
			input=input/10;
		}
		
		if(temp==tempInput)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	}

}
