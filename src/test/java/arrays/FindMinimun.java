package arrays;

public class FindMinimun {

	public static void main(String[] args) {

int a[][]= {{3,9,6},{2,5,8},{10,4,7}};
int min=a[0][0];

for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		if(a[i][j]<min) {
			min=a[i][j];
		}
	}
}
System.out.println("Minimum number is - "+min);

	}

}
