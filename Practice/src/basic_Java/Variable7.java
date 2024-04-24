package basic_Java;

public class Variable7 {
	int b=10;
	static int c=5;
	
	public static void d() {
		int e=15;
		System.out.println(e);
	}
	
	public void f(){
		int g=5;
		System.out.println(g);
		
	}
	
	
	public static void main(String arg[]) {
	int a =6;
	System.out.println(a);
	//static member calling
	System.out.println(c);
	//static method calling
	d();
	System.out.println(Variable7.c);
	Variable7.d();
	
	// calling non static method
	Variable7 obj=new Variable7();
	obj.f();
	}
}
