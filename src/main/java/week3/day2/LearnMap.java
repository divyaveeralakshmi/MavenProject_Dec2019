package week3.day2;

public class LearnMap {

	//Print character count of "T" with both upper and lower case
	
	public static void main(String[] args) {
		{
			String str = "Testteaf";
			int count = 0;
			char[] ch = str.toCharArray();
			for(char c: ch)
				if(c=='T'||c=='t')
				{
					count++;
					
				}
			System.out.println("Char count of T with case insensetive: " +count);
					
		}
	}
}
