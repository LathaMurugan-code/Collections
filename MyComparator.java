package collectionpackage;

import java.util.Comparator;

public class MyComparator implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 =(String)o1;
		String s2 = (String)o2;
		/*
		 * int c=s1.compareTo(s2); 
		 * if(c>0) 
		 * return 1;
		 *  else if(c<0) 
		 *  return -1;
		 *   else 
		 *   return 0;
		 */	
		if(s1.length()>s2.length())
			return -1;
		else if(s1.length()<s2.length())
				return 1;
		else
			return 0;
			
		
	}

}
