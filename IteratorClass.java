package collectionpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add(12);
		t.add(34);
		t.add(67);
		t.add(2);
		System.out.println("TreeSet Elements- "+t);
		Iterator i = t.iterator();
		while(i.hasNext())
		{
			int r = (Integer)i.next();
		 if(r%2!=0)
			 i.remove();
			 
		}
		System.out.println(t);
		

	}
	

}
