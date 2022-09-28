package diamondprob;

public class TestDrive implements First,Second {

	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestDrive ob = new TestDrive(); 
        ob.show(); 
    } 


}
