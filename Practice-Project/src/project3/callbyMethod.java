package project3;

public class callbyMethod {
	public static void swapFunction(int a, int b) {
        System.out.println("Begin swap function: a = " + a + " , b = " + b);
 
        int c = a;
        a = b;
        b = c;
        System.out.println("End swap function: a = " + a + " , b = " + b);
    }
 
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + " , b = " + b);
        swapFunction(a, b);
        System.out.println("\n$$Now, Before and After swapping values will be same here:");
        System.out.println("After swapping: a = " + a + " , b = " + b);
    }

}
