package Fifth_lec_12thNov;

public class Reverse_Pyramid_Pattern {
	
	public static void main(String args[]) {
		
		int n=5;
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i-1;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	 
	}

}
