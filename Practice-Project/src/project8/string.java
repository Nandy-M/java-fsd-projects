package project8;

public class string {

	public static void main(String[] args) {
		        //StringBuilder
				
				System.out.println("Creating StringBuilder");
				System.out.println();
				StringBuilder sb1=new StringBuilder("Happy");
				sb1.append("Learning");
				System.out.println(sb1);
				System.out.println(sb1.delete(0, 1));
				System.out.println(sb1.insert(1, "Welcome"));
				System.out.println(sb1.reverse());
				
				// conversion from String object to StringBuffer 
				System.out.println();
				String str = "Hello"; 
		        StringBuffer sbr = new StringBuffer(str); 
		        sbr.reverse(); 
		        System.out.println("String to StringBuffer");
		        System.out.println(sbr); 
		        System.out.println(); 
		        // conversion from String object to StringBuilder 
		        StringBuilder sbl = new StringBuilder(str); 
		        sbl.append("world"); 
		        System.out.println("String to StringBuilder");
		        System.out.println(sbl);              		
			}




	}


