package project7;

public class innerClass2 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void message(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.message();  
	 }


	public static void main(String[] args) {
		innerClass2  ob=new innerClass2 ();  
		ob.display();  


	}

}
