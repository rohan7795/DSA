package recursion.test.one;

public class Sum_Of_Array {

	public static int sum(int input[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */

		// System.out.println("input[0]");
		if (input.length == 0) {
			return 0;
		}

		int b[] = new int[input.length - 1];
		for (int i = 0; i < input.length - 1; i++) {
			b[i] = input[i + 1];
			// System.out.println("arr set"+b[i]);
		}
		int sumA = sum(b);
		// System.out.println(sumA);

		int sumB = sumA + input[0];

		return sumB;

	}
}
