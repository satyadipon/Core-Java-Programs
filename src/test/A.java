package test;

class A{  
protected void msg(){System.out.println("Hello java");}  

public static void main(String[] args) {
	
	String s = "123123";
	
//	if(s.length() - s.replaceAll(" ", "").length() > 2)
		try {
		System.out.println(s.length() - s.replaceAll(" ", "").length());
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
	s = s.substring(s.indexOf(" "));

//	for(int i=0;i<5;i++)
//		{
//		for(int j=0;j<=i;j++)
//		
//			{
//			System.out.print("*");
//			}
//		System.out.println();
//		}
//	
//	
//	for(int i=0;i<s.length();i++)
//	{
////		String temp = (s%10)*10 + temp;
//		System.out.println(1/10);
//		
//	}
}

}  
  
