package Day_3;

public class Highst_Num_Array {
	
	public static int hight (int[] num) {
		
		if(num.length < 0) {
			return -1 ;
		}
	
		int max = num[0] ;
		
		for (int i = 0 ; i < num.length ; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max ;	
	}
	public static void main(String[] args) {
		int num[]= {-1,-2,-3,-4};
		System.out.println(hight(num));

	}
}