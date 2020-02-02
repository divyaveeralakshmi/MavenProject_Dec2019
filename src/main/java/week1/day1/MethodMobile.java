package week1.day1;

public class MethodMobile {


	private long imeNumber = 1234567891234567L;
	private String color = "White";
//Normal method	
	public void takeSnap()
	{
		System.out.println("Picture is taken");
	}

	//Method with only Parameter
	public void addMobileNumber(long mobileNum)
	{
		System.out.println(mobileNum+" "+"Contact Added");
	}
	
	//Method with parameter and return type
	public long searchNum(String ContactName)
	{
		long num = 9840539378L;
		return num;
	}
	
	//Method with 2 Parameter and return type
	public String addNumber(String cName, long phoneNumber)
	{
		String msg="contact number added sucessfully";
		return msg;
		
	}
	
}
