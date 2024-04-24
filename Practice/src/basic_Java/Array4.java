package basic_Java;

public class Array4 {

	public static void main(String[] args) {
		//defining multidimension array
		
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,4,5,6}};
		int row =a.length;
		System.out.println(row);//number of rows
		int column =a[0].length;
		System.out.println(column);//number of column
		//print all data
		// outer loop
		for(int i=0 ; i<row;i++) {
			//inner loop
			for (int j=0;j<column;j++){
				System.out.println(a[i][j]+" ");
				}
			System.out.println();
		}
	}
}
