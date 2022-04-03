package recursion.test;

public class Pair_Star {
	public static String addStars(String s) {

		if (s.length() == 1)
			return s;

		String str = addStars(s.substring(1));
		// System.out.println(s);
		// System.out.println(str+ " This is str");
		if (s.charAt(0) == s.charAt(1)) {
			// System.out.println("This is true here");
			// System.out.println("This "+ s.charAt(0)+"*"+str);
			return s.charAt(0) + "*" + str;
		}
		return s.charAt(0) + str;
	}

}
