package project1;

public class typeCasting {
	public static void main(String[] args)
	{
		System.out.println("IMPLICIT TYPE CASTING\n");
		byte b=64;
		System.out.println("The byte value is "+b);
		short s=b;//assigning lower data type into higher data type
		System.out.println("The short value is "+s);
		int i=s;
		System.out.println("The integer value is "+i);
		long l=i;
		System.out.println("The long value is "+l);
		float f=l;
		System.out.println("The float value is "+f);
		double d=f;
		System.out.println("The double value is "+d);
		char c='a';
		System.out.println("The character is "+c);
	    i=c;//already i defined above
	    System.out.println("The integer value is "+i);
	    System.out.println();
	    
	    System.out.println("EXPLICIT TYPE CASTING\n");
	     
	    double du=99.54;
	    long lo=(long)du;
	    int x= (int)du;//explicitly type casting
	    System.out.println("The Double value of du is "+du);
	    System.out.println("The Long value of lo is "+lo);
	    System.out.println("The Integer value of x is "+x);
	    
	   
	    
	}

}
