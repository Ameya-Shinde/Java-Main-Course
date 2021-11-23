package _Nov22nd;

import java.util.Scanner;

public class mid_in_array {
	
	static int midEle(int x[],int y) {
		int ele=0;
		y=y/2;
		ele=x[y-1];
		return ele;
	}
	
	public static void main(String args[]) {
		int mid=0;
		int list[]=new int[10];
		int n=list.length;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value in the array(10)");
		for(int i=0;i<n;i++) {
			list[i]=sc.nextInt();
		}
		 mid = midEle(list,n);
		sc.close();
		System.out.println("The mid element is "+mid);
	}

}
