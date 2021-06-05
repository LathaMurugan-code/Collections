package collectionpackage;

public class GenericsClassExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsSample t = new GenericsSample();
		//Creating object for passing object in generics 
		//class
		GenericsClass<GenericsSample> g = new GenericsClass<GenericsSample>(t);
	   g.show();
	   GenericsClass<String> g2 = new GenericsClass<String>("latha");
	   
	   
	}

	

}
