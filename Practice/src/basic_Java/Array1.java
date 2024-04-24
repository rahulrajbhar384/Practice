package basic_Java;

public class Array1 {

	public static void main(String[] args) {
	
		int a[]=new int[5];//Declaring an array
		
		System.out.println(a.length);//print length of array
		// print default value of an int array
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		//assigning value to array
		a[0]=65;
		a[1]=95;
		a[2]=45;
		a[3]=10;
		a[4]=6;
		
		//print array value
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
