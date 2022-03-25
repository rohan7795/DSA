package recursion.test.one;

public class Check_last_index {

	public static int lastIndex(int input[], int x) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */

		return checkLastIndex(input, x, input.length - 1);
	}

	public static int checkLastIndex(int input[], int x, int lastIndex) {

		if (-1 == lastIndex) {
			return -1;
		}
		if (input[lastIndex] == x) {
			return lastIndex;
		}

		return checkLastIndex(input, x, lastIndex - 1);

	}

}
