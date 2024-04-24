package basic_Java;

public class MethodOverride7 {

	public static void main(String[] args) {
		//dynamic method dispatch
		//reference of parent class creating object of child class
		MethodOverride5 m5 =new MethodOverride6();
		m5.cook();
		m5.eat();
		m5.handwash();
		
		
	}

}
