package arrays.strings;

public class UniqueCharacters {

	public static void main(String[] args) {
		System.out.println(isUniqueMask("abc"));
		System.out.println(isUniqueMask("abca"));

		System.out.println(isUniqueSet("abc"));
		System.out.println(isUniqueSet("abca"));

	}

	private static boolean isUniqueMask(String s) {
		if (s == null || s.length() == 0)
			return true;
		if (s.length() > 26)
			return false;
		int mask = 0;

		for (int i = 0; i < s.length(); i++) {
			int pos = s.charAt(i) - 'a';
			if ((mask & (1 << pos)) > 0)
				return false;
			mask |= (1 << pos);
		}
		return true;
	}

	private static boolean isUniqueSet(String s) {
		if (s == null || s.length() == 0)
			return true;
		if (s.length() > 128)
			return false;

		boolean arr[] = new boolean[128];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (arr[ch])
				return false;
			arr[ch] = true;
		}
		return true;
	}

}
