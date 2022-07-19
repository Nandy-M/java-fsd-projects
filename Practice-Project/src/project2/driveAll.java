package project2;

public class driveAll {

	public static void main(String[] args) {
		 PublicModifier obj=new  PublicModifier();
		 obj.message();
		 PrivateModifier obj1=new PrivateModifier();
		 //obj1.message();
		 defaultModifier obj2=new defaultModifier();
		 obj2.message();
		 ProtectedModifier obj3=new ProtectedModifier();
		 obj3.display();
		 
	}

}
