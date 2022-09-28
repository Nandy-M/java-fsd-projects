package arrayrotation;

import java.util.Scanner;

public class main
{
	public static void main(String[] args) {
		 RightRotate r = new  RightRotate();
        		int arr[] = { 1, 2, 3, 4, 5 }; 
        		r.rotate(arr, 3); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
