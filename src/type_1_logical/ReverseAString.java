package type_1_logical;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = recursiveMethod("satya");

		System.out.println(s);

		System.out.println(reverseString("satya"));
	}

	static String reverseString(String s)
	{
		String[] string = s.split("");
		String reverseString = null;
		for(int i=string.length-1;i>=0;i--)
		{
			if(i==string.length-1)
				reverseString = string[i];
			else
				reverseString = reverseString+string[i];

		}

		return reverseString;
	}

	static String recursiveMethod(String s)
	{
		if((null==s)||(s.length()<=1))
			return s;
		return recursiveMethod(s.substring(1))+s.charAt(0);
	}

}
