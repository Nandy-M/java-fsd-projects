package search;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	static int exponentialSearch(int arr[], int n, int x)
    {
		if (arr[0] == x)
			return 0;
		int i = 1;
		while (i < n && arr[i] <= x)
			i = i * 2;
		// Call binary search for the found range.
		return Arrays.binarySearch(arr, i / 2, Math.min(i, n - 1), x);
	}

	// Driver code
	public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the no of elements:");
    	 int n=s.nextInt();
    	 int arr[]=new int[100];
    	 System.out.println("Enter the array elements:");
    	 for(int i=0;i<n;i++)
    	 {
    		 arr[i]=s.nextInt();
    	 }
    	 System.out.println("Enter the key value:");
    	 int key=s.nextInt();
    	 System.out.println();
		 int result = exponentialSearch(arr,n,key);

		System.out.println((result < 0) ? "Element is not present in array" : "Element is present at index " + result);
	}
}
