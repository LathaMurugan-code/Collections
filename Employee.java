package collectionpackage;

import java.util.Arrays;

public class Employee {
	String Name;
    int age;
    int salary;
    Employee(String Name,int age,int salary)
    {
    	this.Name= Name;
        this.age= age;
        this.salary =salary;
    }
    public static void main(String []args)
    {
    	Employee e1= new Employee("Latha", 23,25000);
    	Employee e2= new Employee("Vidhya", 24,25000);
    	Employee e3= new Employee("Singaram", 27,25000);
    	Employee e4= new Employee("Vimal", 30,25000);
    	Employee []e = {e1,e2,e3,e4};
    	EmployeeComparator ec = new EmployeeComparator();
    	Arrays.sort(e, ec);
    	System.out.println("After Sorting");
    	for(int i=0;i<e.length;i++)
    	{
    		System.out.println(e[i]);
    	}
    }
    public String toString() {
    	return this.Name+"->"+this.age+"-"+this.salary;
    }

	
	

}
