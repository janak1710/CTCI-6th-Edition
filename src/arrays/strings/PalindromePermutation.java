package arrays.strings;

public class PalindromePermutation {

	public static void main(String[] args) {
		System.out.println(isPalindromePermuation("jjnnaacb"));
	}

	private static boolean isPalindromePermuation(String s) {
		int count[] = new int[26];
		int odd = 0;
		for (int i = 0; i < s.length(); i++) {
			int pos = s.charAt(i) - 'a';
			odd = odd + ((++count[pos] % 2 == 0) ? -1 : 1);
		}
		return odd <= 1;
	}
}
