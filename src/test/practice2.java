package test;

public class practice2 extends practice1{
	
	public void newmsg() {
		System.out.println("I am absract method");
		
	}
	
	public void msg() {
		super.msg();
		System.out.println("I am overridden interface method");
	}
	
	public static void main(String[] args) {
		
		practice1 obj = new practice2();
		System.out.println(practice.msg);
		obj.msg();
		obj.newmsg();
	}
}
