package _Nov17th;

import java.util.Scanner;

public class print_diff_courses {
	
	static String course(String branch) {
		Scanner n=new Scanner(System.in);
		String c="";
		
		if(branch.equals("CSE") || branch.equals("cse")) {
			System.out.println("Enter your year ");
			int y=n.nextInt();
			switch(y) {
			
			case 1:
				c="Your course is \nEnglish, Mathematics and Science";
				break;
			case 2:
				c="Your course is \nOperating System, Java and Data Structures";
				break;
			case 3:
				c="Your course is \nComputer Organization and Multimedia";
				break;
			case 4:
				c="Your course is \nData Communication and Networks and Multimedia";
				break;
				
				default :
					c="Invalid year, please try again";
			}	
		}else if(branch.equals("ECE")|| branch.equals("ece")) {
			System.out.println("Enter your year ");
			int y=n.nextInt();
			switch(y) {
			
			case 1:
				c="Your course is \nEnglish, Mathematics and Science";
				break;
			case 2:
				c="Your course is \nMicroprocessor and Logic Switching Theory";
				break;
			case 3:
				c="Your course is \nFundamentals of Logic Design and Microelectronics";
				break;
			case 4:
				c="Your course is \nEmbedded Systems and Image Processings";
				break;
				
				default :
					c="Invalid year, please try again";
			}
		}else if(branch.equals("MECH")|| branch.equals("mech")) {
			
			System.out.println("Enter your year ");
			int y=n.nextInt();
			switch(y) {
			
			case 1:
				c="Your course is \nEnglish, Mathematics and Science";
				break;
			case 2:
				c="Your course is \nDrawing and Manufacturing Machines";
				break;
			case 3:
				c="Your course is \nINternal Combustion Engines and Mechanical Vibrations";
				break;
			case 4:
				c="Your course is \nProduction Technology and Thermal Engineering";
				break;
				
				default :
					c="Invalid year, please try again";
			}
		}else {
			c="Please enter valid branch";
		}
		n.close();
		return c;	
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

			String br="";
			System.out.println("Enter the name of your branch ");
			br=sc.nextLine();
			String r=course(br);
			System.out.println(r);
		
		sc.close();
		
	}

}
