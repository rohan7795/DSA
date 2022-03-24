package recursion.test;

public class ReplaceAllOcurrencesOfchar {

	public static void main(String[] args) {

		System.out.println(replace("abcdxdxdx", 'x', 'y'));
	}

	//Replace occcurance of a char with another char
	public static String replace(String s, char c, char r) {

		if (s.length() == 0) {
			return s;
		}

		String st = replace(s.substring(1), c, r);

		if (s.charAt(0) == c) {
			return r + st;
		} else
			return s.charAt(0) + st;

	}

}
