package recursion.test;

public class Check_palindrome {

	public static boolean isStringPalindrome(String input) {
		// Write your code here

		// System.out.println(input);
		if (input.length() <= 1) {
			return true;
		}
		if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		}

		return isStringPalindrome(input.substring(1, input.length() - 1));

	}
}
