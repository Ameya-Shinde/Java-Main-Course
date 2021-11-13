package Fourth_Lec_11thNov;

import java.util.Scanner;

public class Sum_till_n {
public static void main(String args[]) {
		
		int sum=0;
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		s.close();
		
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
