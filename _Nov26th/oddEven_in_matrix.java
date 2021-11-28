package _Nov26th;

public class oddEven_in_matrix {
	public static void main(String args[]) {
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int row=arr.length;
		int coln=arr[0].length;
		int countE=0,countO=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coln;j++) {
				if(arr[i][j]%2==0) {
					countE++;
				}else {
					countO++;
				}
			}
		}
		
		System.out.println("The frequency of even numbers is "+countE);
		System.out.println("The frequency of odd numbers is "+countO);
	}

}
