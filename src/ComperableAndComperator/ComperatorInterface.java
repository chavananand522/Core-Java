package ComperableAndComperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {

	int id;
	String name;
	long salary;

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// natural order: by salary
	@Override
	public int compareTo(Employee e) {
		return Long.compare(this.salary, e.salary);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;

	}
}

// Comparator to sort by name
class NameComperator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}

}

//Comparator to sort by Id
class IdComperator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.id - e2.id;
	}
}

public class ComperatorInterface {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Sunil", 20000));
		list.add(new Employee(2, "Anil", 25000));
		list.add(new Employee(3, "Shyam", 15000));
		list.add(new Employee(4, "Mahesh", 90000));
		list.add(new Employee(5, "Suhas", 50000));

		System.out.println("Sorted by salary(Comperable):");
		Collections.sort(list);							// Employee implements Comparable, Java automatically calls compareTo().
		for (Employee e : list) {
			System.out.println(e);
		}

		System.out.println("\n Sorted by Name(Comperator):");
		Collections.sort(list,new NameComperator()); 		//Java calls the compare() method of NameComparator.
		for (Employee e : list) {
			System.out.println(e);
		}

		System.out.println("\n Sorted by Id(Comperator):");
		Collections.sort(list,new IdComperator());   // Java calls the compare() method of IdComparator.
		for (Employee e : list) {
			System.out.println(e);
		}

	}

}
