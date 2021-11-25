package _Nov24th;

import java.util.Scanner;

public class Reverse_string {
	static String reverse(String str){  
	      String res="";                
	      char[] arr=str.toCharArray();
	        for (int i=0;i<arr.length;i++){
	            res=arr[i]+res;  
	        }
	          return res;
	    }
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Sentence ");
		String t=sc.nextLine();
		
		System.out.println(reverse(t));
		sc.close();
		
}

}
