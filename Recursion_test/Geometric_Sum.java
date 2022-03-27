package recursion.test;

public class Geometric_Sum {

	public static double findGeometricSum(int k) {
		// Write your code here

		if (k == 0) {
			return 1;
		}

		double small = findGeometricSum(k - 1);

		// System.out.println(k);
		// System.out.println("k*2 "+k*2);
		return small + 1 / (Math.pow(2, k));

	}

}
