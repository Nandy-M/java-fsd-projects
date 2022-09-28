package abstraction;

public class Test {

	public static void main(String[] args) {
//		BMW bmw = new BMW();
		
		BMW3 threes= new BMW3();
		threes.accelarate();
		threes.commonFunctionality();
		
		BMW5 fives = new BMW5();
		fives.accelarate();
		fives.commonFunctionality();
	}

}
