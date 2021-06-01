package collectionpackage;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l = new LinkedHashSet();
		l.add(10);
		l.add(5);
		l.add(31);
		l.add(1);
		//Insertion order is maintained 
		//in linkedHashSet
		System.out.println(l);
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(10);
		l1.add(5);
		l1.addAll(l);
		System.out.println(l.containsAll(l1));
		System.out.println(l1);

	}

}
