package week1.day2;

public class SwitchCase {

	public static void main(String[] args) {
		String sOperator = "errorxx";
		switch(sOperator)
		{
		
		case "Add":
			System.out.println("Addition");
			break;
		case "Sub":
			System.out.println("Subtraction");
			break;
		default:
			System.out.println("Please Type the Correct Operator");
		
		}
		
	}

}
