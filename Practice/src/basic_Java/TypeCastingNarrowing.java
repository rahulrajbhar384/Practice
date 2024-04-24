package basic_Java;

public class TypeCastingNarrowing {

	public static void main(String[] args) {

		double b =5.9;
		int a=(int) b; //manual casting double to int
		System.out.println(b);
		System.out.println(a);
		
		//String to integer conversion
		String s ="10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//Integer to string conversion
		int z=5;
		String t= String.valueOf(z);
		System.out.println(t);
		System.out.println(t.length());
	}

}
