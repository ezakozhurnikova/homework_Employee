package homework_employee;

import java.util.Comparator;

public class EmployeeAgeAndThanNameComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2)
    {
        if (employee1.getAge() != employee2.getAge()) {
            return employee1.getAge() - employee2.getAge();
        }
        return employee1.getName().compareTo(employee2.getName());
    }
}
