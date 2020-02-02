package week3.day1;

public class MyMobile {

	// main method to call override and overload methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samsung myMobile = new Samsung();
myMobile.message();

Iphone myPhone = new Iphone();
myPhone.iphonewatsapp(678965432);
myPhone.iphonewatsapp("Hi");

Mobile mobile = new Mobile();
mobile.message();
mobile.makecall();
mobile.watsapp(987654327);

	}

}
