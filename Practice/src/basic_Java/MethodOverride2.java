package basic_Java;

public class MethodOverride2 extends MethodOverride1 {

	public void eat() {
		System.out.println("You are eating");
		
	}
	public static void main(String[] args) {
		MethodOverride2 m2=new MethodOverride2();
		m2.eat();
	}
}
