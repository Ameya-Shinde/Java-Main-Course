package _Nov26th;

public class lower_triangular_matrix {
	public static void main(String args[]) {
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int row=arr.length;
		int coln=arr[0].length;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coln;j++) {
				if(i>=j) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
}
