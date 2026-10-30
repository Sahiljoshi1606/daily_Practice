package Day_2;

public class String_First_Non_Repeted {

	public static char occure(String str) {

		if (str == null || str.length() <= 1) {
			return '\0';
		}

		int[] freq = new int[26];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i) - 'a'] == 1) {
				return str.charAt(i);
			}
		}
		return '\0';

	}

	public static void main(String[] args) {
		System.out.println(occure("aabbccd"));
	}

}
