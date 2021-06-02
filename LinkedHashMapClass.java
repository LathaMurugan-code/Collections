package collectionpackage;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap l = new LinkedHashMap();
		l.put(22, "Raja");
		l.put(66, "Vidhu");
		l.put("h", "Sri");
		l.put(11, "GalaxyStar");
		//Insertion order of keys maintained
		//keys can be heterogenous
		System.out.println(l);
		System.out.println(l.containsKey(33));
		System.out.println(l.containsValue("Kalai"));
		

	}

}
