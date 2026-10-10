package ComperableAndComperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeStats implements Comparable<EmployeeStats> {

    int id;
    String name;
    long salary;

    public EmployeeStats(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Natural order: by salary
    @Override
    public int compareTo(EmployeeStats e) {
        return Long.compare(this.salary, e.salary);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<EmployeeStats> {
    @Override
    public int compare(EmployeeStats e1, EmployeeStats e2) {
        return e1.name.compareTo(e2.name);
    }
}

// Comparator to sort by id
class IdComparator implements Comparator<EmployeeStats> {
    @Override
    public int compare(EmployeeStats e1, EmployeeStats e2) {
        return Integer.compare(e1.id, e2.id);
    }
}

public class ComparatorInterface {

    public static void main(String[] args) {

        ArrayList<EmployeeStats> list = new ArrayList<>();
        list.add(new EmployeeStats(1, "Sunil", 20000));
        list.add(new EmployeeStats(2, "Anil", 25000));
        list.add(new EmployeeStats(3, "Shyam", 15000));
        list.add(new EmployeeStats(4, "Mahesh", 90000));
        list.add(new EmployeeStats(5, "Suhas", 50000));

        System.out.println("Sorted by Salary (Comparable):");
        Collections.sort(list);  // uses compareTo()
        for (EmployeeStats e : list) {
            System.out.println(e);
        }

        System.out.println("\nSorted by Name (Comparator):");
        Collections.sort(list, new NameComparator());
        for (EmployeeStats e : list) {
            System.out.println(e);
        }

        System.out.println("\nSorted by Id (Comparator):");
        Collections.sort(list, new IdComparator());
        for (EmployeeStats e : list) {
            System.out.println(e);
        }
    }
}