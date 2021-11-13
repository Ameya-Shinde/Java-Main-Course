package Second_Lec_9thNov;

import java.util.Scanner;

public class Check_Prime_NonPrime {
public static void main(String args[]) {
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("Enter the Number you want to check");
		int num=n.nextInt();
		n.close();
		int count=0;
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				 count++;
			}	
		}
		
		if(count==0) {
			System.out.println(num+"  Is is Prime Number");
		}else {
			System.out.println(num+"  Is is not Prime Number");
		}
		
	}

}
