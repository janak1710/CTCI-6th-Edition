package arrays.strings;

public class URLify {

	public static void main(String[] args) {
		System.out.println(generateURL("Mr  John Smith    "));

	}

	private static String generateURL(String s) {
		if (s == null || s.length() == 0)
			return s;
		s = s.trim();
		s = s.replaceAll("\\s+", " ");

		StringBuffer sb = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				sb.insert(0, "%20");
			} else {
				sb.insert(0, s.charAt(i));
			}

		}

		return sb.toString();
	}
}
