package _Nov26th;

public class Check_sparse_matrix {
	public static void main(String args[]) {
		int arr[][]= {
				{1,0,0},
				{0,5,0},
				{0,0,9}
		};
		int row=arr.length;
		int coln=arr[0].length;
		int size=row*coln;
		int count=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coln;j++) {
				if(arr[i][j]==0) {
					count++;
				}
			}
		}
		
	if(count>(size/2)) {
		System.out.println("Given matrix is a sparse matrix");
	}else {
		System.out.println("Given matrix is not a sparse matrix");
	}
			
	}
}
