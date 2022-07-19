package project7;

public class driveAnnonymous {

	public static void main(String[] args) {
		annonymousClass i = new annonymousClass() 
		{
	         public void display()
	         {
	            System.out.println("Anonymous Inner Class");
	         }
	      
		};
	      i.display();
	   }

	}


