package collectionpackage;

import java.util.HashMap;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h = new HashMap();
		h.put(1, 20);
		h.put(4, 78);
		h.put(3, 20);
		h.put(2,45);
		System.out.println(h);
		System.out.println("For Key value 4- "+h.get(4));
		//HashMap h2 = (HashMap)h.clone();
		Object hp2 = new HashMap();
		hp2 = h.clone();
		System.out.println("H2 becomes- "+hp2);
		h.remove(2);
		System.out.println("After removing key 2- "+h);
		System.out.println(h.remove(3, 20));
		System.out.println(h);
		System.out.println("Entries in set: "+h.entrySet());
		System.out.println("keys: "+h.keySet());
		System.out.println("Values: "+h.values());
		
		
		

	}

}
