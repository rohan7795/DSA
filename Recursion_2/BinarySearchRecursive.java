package recursion.test;

public class BinarySearchRecursive {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(binaryRecursive(arr, 0, arr.length - 1, 01));
	}

	public static int binaryRecursive(int[] arr, int s, int e, int x) {
		
		if(s>e)
			return -1;
		
		int midIndex = (s+e)/2;
		
		if(arr[midIndex] == x) {
			return midIndex;
		}
		else if(arr[midIndex]<x)
			return binaryRecursive(arr, midIndex+1, e, x);
		else
			return binaryRecursive(arr,s , midIndex-1, x);
	}

}
