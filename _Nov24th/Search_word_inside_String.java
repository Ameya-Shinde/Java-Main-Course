package _Nov24th;

import java.util.Scanner;

public class Search_word_inside_String {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String ");
		String str=sc.nextLine();
		
		str=str.toLowerCase();
		
		System.out.println("Enter the word u want to search");
		String str1=sc.nextLine();
		
		str1=str1.toLowerCase();
		
		boolean r=str.contains(str1);
		System.out.println(r);
		sc.close();
				
	}

}
