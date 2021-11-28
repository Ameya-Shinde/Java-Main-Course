package _Nov25th;

public class Add_2darray {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{7,8,9},{10,11,12}};
		int row=a.length;
		int coln=a[0].length;
		int c[][]=new int[row][coln];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coln;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("the addition matrix is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<coln;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
