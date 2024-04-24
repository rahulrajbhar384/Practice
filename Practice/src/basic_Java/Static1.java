package basic_Java;

public class Static1 {

	int x=100; //Global Variable
	String s="Hello";//Global Variable
	static int y =200;//static Variable
	
	//Static Method
	public static void main(String[] args) {
		String x= "HI"; // Local Variable
		System.out.println(x);
		Static1 stc=new Static1();
		stc.method1();
		

	}
	//Non static method
	public void method1() {
		int i =100;// Local Variable
		System.out.println(i);
	}

}
