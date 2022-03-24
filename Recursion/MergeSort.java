package recursion.test;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] input) {
		// Write your code here

		return mergeSort1(input);

	}

	public static int[] mergeSort1(int[] input) {
		if (input.length == 1) {
			return input;
		}

		int mid = (input.length - 1) / 2;

		int arr1[] = Arrays.copyOfRange(input, 0, mid);
		int arr2[] = Arrays.copyOfRange(input, mid + 1, input.length - 1);

		arr1 = mergeSort1(arr1);
		arr2 = mergeSort(arr2);

		return merge(arr1, arr2);

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int f = 0;
		int s = 0;
		int k = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		while (f < arr1.length && s < arr2.length) {
			if (arr1[f] < arr2[s]) {
				arr3[k] = arr1[f];
				k++;
				f++;
			} else {
				arr3[k] = arr2[s];
				k++;
				s++;
			}
		}

		while (f < arr1.length) {
			arr3[k] = arr1[f];
			k++;
			f++;
		}
		while (s < arr2.length) {
			arr3[k] = arr2[s];
			k++;
			s++;
		}

		return arr3;
	}

}
