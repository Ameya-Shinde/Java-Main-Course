package _Nov22nd;

import java.util.Scanner;

public class Sum_in_array {
	
	static int arrsum(int x[],int y) {
		int sum=0;
		for(int i=0;i<y;i++) {
			sum+=x[i];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int sum=0;
		int list[]=new int[10];
		int n=list.length;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value in the array(10)");
		for(int i=0;i<n;i++) {
			list[i]=sc.nextInt();
		}
		sc.close();
		sum=arrsum(list,n);
		System.out.println("The sum of given array is "+sum);
		
	}

}
