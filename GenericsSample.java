package collectionpackage;

import java.util.ArrayList;

public class GenericsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Akshaya");
		al.add("Unnamalai");
		al.add("Dharshini");
		al.add("Srimathi");
		for(Object s:al)
		{
			System.out.print(s+" ");
		}
		//for each loop to print Arraylist elements.
		GenericMethod g = new GenericMethod();
		g.display(al);
		System.out.println();
		ArrayList<String> l = new ArrayList<String>();
		l.add("Karthick");
		l.add("Sanjay");
		l.add("Madhan");
		l.add("Dhaanu");
		for(String s:l)
		{
			System.out.print(s+" ");
		}
		g.display(l);
		
		
		
		

	}

}
