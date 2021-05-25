package collectionpackage;
import java.util.ArrayList;
public class ArraylistSample {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(23);
		//adds integer object
		a.add(0.5f);
		a.add("latha");
		System.out.println("Index of latha- "+a.indexOf("latha"));
		a.add(2,true);
		//add object at specified index
		System.out.println("At index 1- "+a.get(1));
		//Returns value at specified index
		System.out.println(a);
		System.out.print("Is object 23 exists? ");
		System.out.println(a.contains(23));
		ArrayList a2 = new ArrayList();
		a2.addAll(a);
		//adds all elements from a
		System.out.println("a2 ArrayList"+a2);
		System.out.println("Arraylist after remove operation");
		a.remove(2);
		//remove the object at specified index
		a.remove("latha");
		System.out.println(a);
		a.removeAll(a);
		//removes whole collection class
		System.out.println(a);
		System.out.println("Arraylist empty? "+a.isEmpty());
	
		
		

	}

}
