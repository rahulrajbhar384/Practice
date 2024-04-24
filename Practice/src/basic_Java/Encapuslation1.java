package basic_Java;

public class Encapuslation1 {

	String name;
	int b;
	final int c=2; //final variable - we cannot change the variable

	public void a() {
		
		c=5; //final variable cannot change
	}
	//final method 
	final void d() {
		System.out.println("final method");
		}
	public void setName(String s) {
		this.name = s; // for association this is used
	}
}
