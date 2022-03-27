package recursion.test;

public class SumOfDigits_recursion {

	public static int sumOfDigits(int input) {
		// Write your code here

		// System.out.println("i "+input);
		if (input <= 9) {
			return input;
		}
		// System.out.println(input);
		int num = sumOfDigits(input / 10);
		// System.out.println("value of "+input);
		int sum = num + input % 10;
		// System.out.println("value of sum "+sum);
		return sum;
	}
}
