package recursion.test;

public class Count_Zero {

	static int c = 0;

	public static int countZerosRec(int input) {
		if (input <= 9) {
			if (input == 0)
				return c += 1;
			else
				return c;
		}
		if (input % 10 == 0) {
			c++;
		}
		countZerosRec(input / 10);

		return c;
	}
}
