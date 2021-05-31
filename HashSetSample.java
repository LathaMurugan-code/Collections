package collectionpackage;

import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
	    HashObject o = new HashObject("Latha",23);
	    HashObject o2 = new HashObject("Lalith",23);
	    HashObject o3 = new HashObject("Lily",23);
	    HashObject o4 = new HashObject("Latha",23);
	    
	    h.add(o4);
	    h.add(o3);
	    h.add(o2);
	    h.add(o);
	    System.out.println(h);
	    
		

	}

}
