package _Nov24th;

import java.util.Scanner;

public class Palindrome {
	static void palindrome(String str){

        int start=0;
        int end=str.length()-1;

        while(start<=end/2){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("Not a palindrome");
                break;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Sentence ");
		String t=sc.nextLine();
		palindrome(t);
		sc.close();
	}
}
