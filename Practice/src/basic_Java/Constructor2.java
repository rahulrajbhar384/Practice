package basic_Java;

public class Constructor2 {

	int id;
	String name;
	String address;
	
	Constructor2(){
		System.out.println("Hello Default Constructor");
		
	}
	
	//parameterized constructor
	
	Constructor2(int a, String b, String c){
		
	this.id=a;
	name = b;
	address = c;
	}
	
	public void displayInfo() {
		
		System.out.println(id+" "+name+" "+address);
		
		
	}
	public static void main(String[] args) {
		//default constructor
		Constructor2 c2=new Constructor2();
		
		Constructor2 c3=new Constructor2(1, "John", "Wick");
		c3.displayInfo();
		Constructor2 c4=new Constructor2(2, "Rahul", "Rajbhar");
		c4.displayInfo();
	}
}
