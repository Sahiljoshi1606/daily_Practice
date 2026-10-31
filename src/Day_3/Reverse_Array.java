package Day_3;

public class Reverse_Array {
	public static int reverse(int[] arr) {
		
		int newArr = 0 ;
		
		for (int i = arr.length - 1 ; i < 0 ; i--) {
			newArr = i;
		}
		return newArr ;
	}

	public static void main(String[] args) {
int num[]= {1,2,3,4};
System.out.println(reverse(num));
	}

}
