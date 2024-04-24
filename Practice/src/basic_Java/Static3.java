package basic_Java;

public class Static3 {

	int roll;// Declaring Global Variable
	String name; // Declaring Global Variable
	static String College= "IIT Bombay";
	
	//Constructor
	Static3(int r, String n){
		
		roll=r;
		name=n;
		}
	public void getResult() {
		System.out.println(roll +" "+ name+" "+ College);
	}
	
}
