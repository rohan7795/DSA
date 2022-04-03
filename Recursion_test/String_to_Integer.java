package recursion.test;

public class String_to_Integer {

	public static int convertStringToInt(String input) {

		if (input.length() == 1) {
			return Integer.parseInt(input);
		}
		int i = convertStringToInt(input.substring(0, input.length() - 1));
		return i * 10 + Integer.parseInt(input.substring(input.length() - 1));

	}

}
