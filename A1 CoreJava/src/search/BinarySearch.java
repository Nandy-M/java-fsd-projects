package search;

import java.util.Scanner;

public class BinarySearch {
	 static int binarySearch(int arr[],int l,int r,int key)
	{
		if(l<=r)
		{
			int mid=(l+r)/2;
			if(arr[mid]==key)
				  return mid+1;
			else if(arr[mid]>key)
				  return binarySearch(arr,l,mid-1,key);
			else
			     return binarySearch(arr,mid+1,r,key);
			
		}
		return -1;
	}
	
	
	
     public static void main(String[] args)
     {
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
    	 int result=binarySearch(arr,0,n-1,key);
    	 if(result==-1)
    	 {
    		 System.out.println("Element not found");
  
    	 }
    	 else
    	 {
    		 System.out.println("Element found at "+result);
    	 }
     }
}
