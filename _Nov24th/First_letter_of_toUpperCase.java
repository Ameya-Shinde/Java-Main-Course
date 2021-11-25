package _Nov24th;

import java.util.Scanner;

public class First_letter_of_toUpperCase {
	
	 static String toupper(String str)
	    {
	 
		        char ch[] = str.toCharArray();
	        for (int i = 0; i < str.length(); i++) {
	 
		            if (i == 0 && ch[i] != ' ' ||
	                ch[i] != ' ' && ch[i - 1] == ' ') {
	 
		                if (ch[i] >= 'a' && ch[i] <= 'z') {
	 
		                    ch[i] = (char)(ch[i] - 'a' + 'A');
	                }
	            }
	 
		             else if (ch[i] >= 'A' && ch[i] <= 'Z')
	 
		                ch[i] = (char)(ch[i] + 'a' - 'A');           
	        }
	 
	        String r = new String(ch);
	        return r;
	    }
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Sentence ");
		String t=sc.nextLine();
		
		System.out.println(toupper(t));
		sc.close();
		
}
}