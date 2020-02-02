package week1.day1;

public class MethodMyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MethodMobile obj = new MethodMobile();
obj.takeSnap();
obj.addMobileNumber(9566188394L);

long num = obj.searchNum("Divya");
System.out.println(num);

String addNum = obj.addNumber("Div", 9003187310l);
System.out.println(addNum);

	}

}
