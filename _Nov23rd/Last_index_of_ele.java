package _Nov23rd;

public class Last_index_of_ele {
public static void main(String args[]) {
		
		int arr[]= {1,2,3,2,5,1};
		int ele=2;
		int index=-1;
		int n=arr.length;
		
		int i=0;
		while(i<n) {
			if(arr[i]==2) {
				index=i;
			}
			i++;
		}
		System.out.println("Index of "+ele+" is "+index);
	}

}
