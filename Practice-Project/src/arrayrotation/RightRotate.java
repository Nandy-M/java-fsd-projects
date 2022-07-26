package arrayrotation;

public class RightRotate {
	public void rotate(int[] arr,int k)
	{   
		
		for(int i=0;i<k;i++)
		{
			int j,last;
			last=arr[arr.length-1];//arr.length-1  5-1=4  arr[4]
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}	
	}
	
}
  
