package recursion.test.one;

public class Print_First_N_Natural_Numbers {

	public static void print(int n) {
		// Write your code here

		if (n == 0) {

			return;
		}
		print(n - 1);
		System.out.print(n + " ");

	}
}
