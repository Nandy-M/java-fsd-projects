package project4;

public class driveParameter {

	public static void main(String[] args) {
		parameterConstructor[] arr ;
		arr =new parameterConstructor[3];
		arr[0]= new parameterConstructor(172,"Kavyashree");
		arr[1]= new parameterConstructor(196,"Nandhini");
		arr[2]= new parameterConstructor(197,"Nandu");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student with register number="+ arr[i].registernumber+" is "+arr[i].studentname);
			System.out.println();
		}
	}

}
