package homework_employee;

import Our_comparator.Animals.Animal;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getAge(),employee2.getAge());
    }
}
