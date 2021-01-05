package test;

public class practiceLogic {
	
	void reverseString(String string){
		
		char[] charArray = string.toCharArray();
		char[] reversedArray = null;
		int j=0;
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
			
		}
		
	}
	
	String removeWhiteSpace(String string) {
		
		String result = "";
		for(int i=0;i<string.length();i++) {
			if(!(string.charAt(i)==' '))
				result = result + string.charAt(i);
		}
		
		return result;
	}
	
	void ifPalindrome(int input) {
		
		int result = 0;
		int temp = input;
		while(input>0) {
		 result = (result*10) + (input%10);
		 input = input/10;
		}
		System.out.println(result);
		if(temp==result)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome!");
	}

	public static void main(String[] args) {
		
		practiceLogic practice = new practiceLogic();
//		practice.reverseString("Amazon");
//		System.out.println(practice.removeWhiteSpace("A m a z o n"));
		practice.ifPalindrome(12321);
	}

}
