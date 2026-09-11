package ComperableAndComperator;

import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable <Employee>{		//This tells compiler that Employee objects can be compared with each other.
	
	int id;
	String name;
	long salary;
	
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee e) {				//This compares the salary of the current employee (this) with another employee (e).
		return Double.compare(this.salary,e.salary);	
	}
	
	@Override
	public String toString() {					//Without it Employee@5acf9800 such code is return
		return id+" "+name+" "+salary;
	}
	
}

public class ComperableInterface {
	public static void main(String[] args) {
	
		ArrayList <Employee>list = new ArrayList<>();		
		
		list.add(new Employee(1,"Amit",50000));
		list.add(new Employee(2,"Ram",90000));
		list.add(new Employee(3,"Rahim",45000));

		Collections.sort(list);			//Java automatically calls the compareTo() method to sort the list.
		
		for(Employee e:list) {			
			System.out.println(e);
		}

	}

}
