package collectionpackage;

import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeComparator c = new EmployeeComparator();
		PriorityQueue<Employee> p = new PriorityQueue<Employee>(c);
		Employee e1 = new Employee("kalai", 29, 35000);
		Employee e2 = new Employee("Saran",25,25000);
		Employee e3 = new Employee("Sujee", 27, 15000);
		p.offer(e1);
		p.offer(e2);
		p.offer(e3);
		System.out.println(p);
				

	}

}
