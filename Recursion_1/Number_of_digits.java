package recursion.test.one;

public class Number_of_digits {

	public static int count(int n) {
		// Write your code here

		if (n == 0) {
			return 0;
		}

		int digit = count(n / 10);

		return digit + 1;
	}
}
