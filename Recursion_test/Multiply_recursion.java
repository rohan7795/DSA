package recursion.test;

public class Multiply_recursion {

	public static int multiplyTwoIntegers(int m, int n) {
		// Write your code here

		if (n == 0) {
			return 0;
		}

		int mul = multiplyTwoIntegers(m, n - 1);
		int fin = mul + m;

		return fin;
	}

}
