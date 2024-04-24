package basic_Java;

public class Array2 {

	public static void main(String[] args) {

		int b[]= {1,2,3,4,5};
		
		String s[]= {"Rahul", "Rohan", "Ronak"};
		
		Object a[]= {1,2,"Selenium",6.5 ,'a'}; //Object array we can define all the value
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		
		System.out.println(a[2]);
		System.out.println(b[4]);
		System.out.println(s[2]);
		
		a[2]="Ray";// modifying array value using index
		System.out.println(a[2]);
	
	}

}
