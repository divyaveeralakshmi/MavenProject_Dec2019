package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	//Print only Duplicate value
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> empId = new LinkedHashSet();
		if(empId.add(5)==false)
		{
			System.out.println(5);
		}
		if(empId.add(10)==false)
		{System.out.println(10);}
		if(empId.add(8)==false)
		{System.out.println(8);}
		if(empId.add(7)==false)
		{
			System.out.println(7);
		}
		if(empId.add(5)==false)
		{
			System.out.println(5);
		}
		if(empId.add(10)==false)
		{
			System.out.println(10);
		}
		if(empId.add(2)==false)
		{System.out.println(2);}
		if(empId.add(3)==false)
		{System.out.println(3);}
		if(empId.add(9)==false)
		{System.out.println(9);}
		if(empId.add(10)==false)
		{
			System.out.println(10);
		}
		
		
		
	}

}
