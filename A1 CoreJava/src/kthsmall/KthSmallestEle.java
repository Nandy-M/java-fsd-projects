package kthsmall;

public class KthSmallestEle {

// method for sorting the array arr  
	public void sortArr(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	public int findKthSmallest(int arr[], int k) {
		sortArr(arr);
		return arr[k - 1];
	}

	public static void main(String argvs[]) {
		KthSmallestEle obj = new KthSmallestEle();

		int arr1[] = { 90, 87, 30, 9, 12, 41, 13, 80, 67, 70 };

		int k = 4;

		System.out.println("For the array: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		int ele = obj.findKthSmallest(arr1, k);
		System.out.println();
		System.out.println("The " + k + "th smallest element of the array is: " + ele);

	}
}