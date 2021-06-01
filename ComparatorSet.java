package collectionpackage;

import java.util.Comparator;

public class ComparatorSet implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	/*
	 * @Override public int compare(Object o1, Object o2) { // TODO Auto-generated
	 * method stub Integer t1 = (Integer)o1; Integer t2 = (Integer)o2;
	 * //Autoboxing-automatic conversion in //collection if(t2>t1) return 1; else
	 * if(t1>t2) return -1; else return 0; }
	 */
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
      TreeSetObject t1 = (TreeSetObject)o1;
      TreeSetObject t2 = (TreeSetObject)o2;
      int Result=t1.Trainee.compareTo(t2.Trainee);
      if(Result>0)
      return 1;
      else if(Result<0)
    	  return -1;
      else
    	  return 0;
	}
      
      
		
	
        }
