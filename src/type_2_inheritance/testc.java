package type_2_inheritance;

public class testc {
	
	public static void name(String args[]) {
		
//		testb b = new testb();
//		System.out.println(b.num);
		int i =0;
		boolean t = true;
		boolean f = false, b;
		
		b = (t || ((i++)==0));
		b = (f || ((i+=2)>0));
		System.out.println(i);
	}

}
