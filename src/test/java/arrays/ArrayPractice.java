package arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array and allocates memory
		int a[] = new int[5]; //means array a[] can accomodate 5 values of int datatype
		int b[] = {1,2,3,4,5,6}; //memory is dynamincally allocated.
		b[5]= 7;
		System.out.println("Val of b[5]- "+b[5]);
		
		int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(c[i][j]);
			}
		}
		

	}

}
