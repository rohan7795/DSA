package recursion.test;

public class Check_AB {

	public static boolean checkAB(String input) {
		// Write your code here

		if (input.length() == 1 && input.charAt(0) == 'a') {
			return true;
		}
		if ((input.endsWith("bb") && (input.length() >= 1))) {

			return checkAB(input.substring(0, input.length() - 2));
		}
		if ((input.endsWith("a")) && (input.length() >= 1)) {
			return checkAB(input.substring(0, input.length() - 1));
		}

		return false;
	}
}
