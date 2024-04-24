package basic_Java;

public class Static5 {

	static int z=5;
	int y=1;
	
	// Static method
	public static void a() {
		z=10; // modification of value of z
		System.out.println(z);
	}
	public void b() {
		
		z=15;
		System.out.println(z);
		a();
	}
	public static void main(String[] args) {
		a();
		Static5 s5=new Static5();
		s5.b();
	}
}
