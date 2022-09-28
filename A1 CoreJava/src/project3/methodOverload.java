package project3;

public class methodOverload {
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public float sum(int a,float b)
	{
		return a+b;
	}
	public float sum(float a,float b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		methodOverload m=new methodOverload();
		System.out.println(m.sum(2,3));
		System.out.println(m.sum(2, 3,4));
		System.out.println(m.sum(2, 3.4f));
		System.out.println(m.sum(4.4f,4.4f));
		

	}
}
