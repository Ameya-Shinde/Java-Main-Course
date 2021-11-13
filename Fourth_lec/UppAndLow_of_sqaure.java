package Fourth_lec;

public class UppAndLow_of_sqaure {
	public static void main(String args[]) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print("  ");
			}
			
			
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	 
	}

}
