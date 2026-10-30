package Day_2;

public class Highst_Occurance_String {
	
	public static char occure(String str) {
		if(str == null || str.length() <= 1) {
			return 0 ; 
		}
		
		int[] freq = new int[26];
		
		
		for(int i = 0 ; i < str.length() ; i++) {
			freq[str.charAt(i)-'a']++ ;
		}
		
	int maxCount = 0 ;
	char character = ' ';
	
	for(int i = 0 ; i < 26 ; i++) {
		if(freq[i] > maxCount) {
			maxCount = freq[i];
			character = (char)(i + 'a');
		}
	}
return character ;		
		
	}

	public static void main(String[] args) {
System.out.println(occure("aabbbbbccc"));

	}

}
