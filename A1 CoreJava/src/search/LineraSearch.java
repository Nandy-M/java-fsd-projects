package search;

import java.util.Scanner;

public class LineraSearch {
	static int linearSearch(int arr[],int n,int key)
	{
		 for(int i=0;i<n;i++){    
	            if(arr[i] == key){    
	                return i+1;    
	            }    
	        }    
	        return -1;    
	}    

	public static void main(String[] args) {
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
    	 int result=linearSearch(arr,n,key);
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
