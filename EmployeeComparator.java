package collectionpackage;
import java.util.Comparator;
public class EmployeeComparator implements Comparator {
	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 =(Employee)o1;
		Employee e2 =(Employee)o2;
		if(e1.age>e2.age)
			return -1;
		else if(e1.age<e2.age)
			return 1;
		else 
			return 0;
	}
}
