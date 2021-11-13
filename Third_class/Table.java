package Third_class;

import java.util.Scanner;

public class Table {
	public static void main(String agrs[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=10) {
			int prod=n*i;
			System.out.println(n+"*"+i+"="+prod);
			i++;
		}
			
	}
}
