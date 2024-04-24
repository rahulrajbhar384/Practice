package basic_Java;

public class Array3 {

	static int c[]= {22,34,67};
	
	public static void passingArraytoMethod(int c[]) {
		int b=c[0];	
		for (int i=0; i<c.length;i++) {
			if(b>=c[i]) {
				System.out.println(b);
				
			}else {
				System.out.println("ABCD");
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
passingArraytoMethod(c);
	}

}
