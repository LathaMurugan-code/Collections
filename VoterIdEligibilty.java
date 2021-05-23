package collectionpackage;
import java.util.Calendar;
public class VoterIdEligibilty{
	
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		Calendar setdate = Calendar.getInstance();
		System.out.println(c.getTime());
		setdate.set(setdate.YEAR, 2003);
		setdate.set(setdate.MONTH, 4);// give month-1
		setdate.set(setdate.DATE, 18);
		setdate.add(setdate.YEAR, 18);
		System.out.println(setdate.getTime());
		int value=setdate.compareTo(c);
		System.out.println(value);
		if(value>=0)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting");
		}
		
	}
}
