package _Nov17th;

import java.util.Scanner;

public class Print_grade_using_method {
	
	static char grade(float x) {
		char result=' ';
		float total=x/5;
		float g=total/10;
		if(g>9) {
			result='A';
		}else if(g>8 && g<=9) {
			result='B';
		}else if(g>7 && g<=8) {
			result='C';
		}else if(g>6 && g<=7) {
			result='D';
		}else if(g>5 && g<=6) {
			result='E';
		}
		System.out.println("Your percentage is = "+total);
		return result;
	}
	
	
	public static void main(String args[]) {
		char ch;
		float a=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			for(int i=1;i<=5;i++) {
			System.out.println("Enter the marks of "+i+" subject");
			a+=sc.nextFloat();
			}
			
			char r=grade(a);
			System.out.println("Your grade is = "+r);
			System.out.println("Do you wish to continue?(Yes/No)");
			ch=sc.next().charAt(0);
			
			
		}while(ch=='y'||ch=='Y');
		sc.close();
	}

}
