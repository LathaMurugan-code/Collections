package collectionpackage;

import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparatorSet c = new ComparatorSet();
		//overrides compare method to produce
		//own sorted order
		TreeSet t = new TreeSet(c);
//		t.add(15);
//		t.add(128);
//		t.add(20);
//		t.add(45);
//		Sorted order of objects are maintained
		TreeSetObject s = new TreeSetObject("latha","JAVA",16000);
		TreeSetObject s2 = new TreeSetObject("kalai","JAVA",16000);
		TreeSetObject s3 = new TreeSetObject("vidya","JAVA",16000);
		TreeSetObject s4 = new TreeSetObject("shoba","JAVA",16000);
		
		t.add(s);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println(t);
		

	}

}
