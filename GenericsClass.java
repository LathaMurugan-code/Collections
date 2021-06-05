package collectionpackage;

public class GenericsClass<T> {
 T t;
 public GenericsClass(T o)
 {
	 this.t = o;
 }
 void show()
 {
	 System.out.println("Class of the object");
	 System.out.println(t.getClass().getTypeName());
 }

}
