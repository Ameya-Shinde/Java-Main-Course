package _Nov22nd;

import java.util.Scanner;

public class positive_nums_in_array {
	
	
	public static void main(String args[]) {
		int p=0;
		int list[]=new int[10];
		int n=list.length;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value in the array(10)");
		for(int i=0;i<n;i++) {
			list[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The positive numbers from the given array are ");
		for(int i=0;i<n;i++) {
			if(list[i]>0) {
				p=list[i];
				System.out.println(p);
			}
		}
	}
}
