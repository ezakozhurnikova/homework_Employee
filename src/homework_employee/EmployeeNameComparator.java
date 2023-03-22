package homework_employee;

import Our_comparator.Animals.Animal;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return employee1.name.compareTo(employee2.name);
    }
}
