package type_1_logical;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(12321);

	}
	
	static void isPalindrome(int input) {
		
		int tempInput = input;
		int temp=0;
		
		while(input>0)
		{
			temp = (temp*10) + (input%10);
			input = input/10;
		}
		
		if(tempInput==temp)
			System.out.println(tempInput+" is palindrome");
		else
			System.out.println(tempInput+" is not palindrome");
	}

}
