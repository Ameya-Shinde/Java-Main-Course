package Fifth_lec_12thNov;

public class Diamond_Pattern {
public static void main(String args[]) {
		
		int n=5;
		//upper part
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		//down part
		
		for(int i=4;i>=0;i--) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	
	
	

}
