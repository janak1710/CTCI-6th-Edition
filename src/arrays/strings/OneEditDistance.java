package arrays.strings;

public class OneEditDistance {

	public static void main(String[] args) {
		System.out.println(isOneEditDistance("pale", "ple"));
		System.out.println(isOneEditDistance("pales", "pale"));
		System.out.println(isOneEditDistance("pale", "bale"));
		System.out.println(isOneEditDistance("pale", "bake"));

	}

	private static boolean isOneEditDistance(String str1, String str2) {
		if (Math.abs(str1.length() - str2.length()) > 1)
			return false;
		int i = 0;
		int j = 0;
		int m = str1.length();
		int n = str2.length();
		int count = 0;
		while (i < m && j < n) {
			// If current characters don't match
			if (str1.charAt(i) != str2.charAt(j)) {
				if (count == 1)
					return false;

				// If length of one string is
				// more, then only possible edit
				// is to remove a character
				if (m > n)
					i++;
				else if (m < n)
					j++;
				else // Iflengths of both strings is same
				{
					i++;
					j++;
				}

				// Increment count of edits
				count++;
			}

			else // If current characters match
			{
				i++;
				j++;
			}
		}

		// If last character is extra in any string
		if (i < m || j < n)
			count++;

		return count == 1;
	}

}
