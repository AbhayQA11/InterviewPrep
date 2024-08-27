package arrays;

public class MaxNumberinMinRow {

	public static void main(String[] args) {
		
		int a[][]= {{3,9,6},{2,5,1},{10,4,7}};
		int min=a[0][0];
		int minCol = 0,k = 0;
		int max=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					minCol=j;
				}
			}
		}
		System.out.println(minCol);
		max=a[0][minCol];
		while(k<3) {
			if(a[k][minCol]>max) {
				max=a[k][minCol];
			}
			k++;
			
		}
		System.out.println("Max number in col - "+max);
	}
}
