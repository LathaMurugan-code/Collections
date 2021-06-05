package collectionpackage;

import java.util.ArrayList;

public class GenericMethod {
	

	public static void display(ArrayList<?> lb) {
		// <?> denotes Any class objects
		//<?> extends any class which has to be bounded 
		//within that class
		System.out.println(lb);
		
	}

}
