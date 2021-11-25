package _Nov23rd;

public class diff_in_2_array {
	public static void main(String args[]) {
		int arr1[]= {5,8,7,9,5,2};
		int arr2[]= {8,2,6,4,5,7};
		
		int n=arr1.length;
		int arr3[]=new int[n];
		for(int i=0;i<n;i++) {
			arr3[i]=arr1[i]-arr2[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
