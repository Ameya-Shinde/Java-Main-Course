package Fifth_lec_12thNov;

public class Reverse_Pyramid_with_Number_Pattern {
	public static void main(String args[]) {
		
    int n=5;
    int l=1;
    for(int i=n;i>=1;i--) {
    	for(int j=1;j<=n-i;j++) {
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++) {
    		System.out.print(l+" ");
    	}
    	System.out.println();
    	l++;
    }
    
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
          
        for (int k = i; k <= n; k++) { 
        	System.out.print(k+" "); 
        } System.out.println(); }

}
}
