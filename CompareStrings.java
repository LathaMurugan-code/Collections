package collectionpackage;

import java.util.Arrays;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Latha";
		String s2="Kalaiarasan";
		String s3="Murugan";
		String s4="Ramamoorthy";
		String [] s= {s1,s2,s3,s4};
		Arrays.sort(s);
		for(String a:s)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		MyComparator c = new MyComparator();
		Arrays.sort(s, 0, 4, c);
		System.out.println("Sorted with comparator");
		for(String a:s)
		{
			System.out.print(a+" ");
		}

	}

}
