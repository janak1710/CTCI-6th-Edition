package arrays.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagramSort("janak bhalla", "ajhb lalakan"));
		System.out.println(isAnagramCharCount("janak bhalla", "ajhb lalakan"));
		System.out.println(isAnagramSort("abc", "jab"));
		System.out.println(isAnagramCharCount("abc", "jab"));
	}

	private static boolean isAnagramSort(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		return sort(s1).equals(sort(s2));
	}

	private static String sort(String s) {
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	private static boolean isAnagramCharCount(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		int count[] = new int[128];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			count[s2.charAt(i)]--;
			if (count[s2.charAt(i)] < 0)
				return false;
		}
		return true;
	}
}
