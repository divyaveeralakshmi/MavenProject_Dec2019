package week1.day1;

public class MyMobile {
	
public static void main(String[] args) {
	
	Mobile myMob = new Mobile();
	
	boolean isApple = myMob.isApple;
	//System.out.println(isApple);
	
	String mobileName = myMob.mobileName;
	//System.out.println(mobileName);
	
	int mobileNumber = myMob.mobileNumber;
	//System.out.println(mobileNumber);
	
	System.out.println(isApple+" "+mobileName+" "+mobileNumber);
	}
}
