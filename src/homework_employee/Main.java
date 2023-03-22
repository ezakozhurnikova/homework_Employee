package homework_employee;

import Our_comparator.Animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<>();
        employees.add(new Employee(1,"Mike",23,4000));
        employees.add(new Employee(4,"Linn",23,4500));
        employees.add(new Employee(6,"Rick",43,6000));
        employees.add(new Employee(5,"Leo",33,5000));
        employees.add(new Employee(9,"Lisa",42,6500));
        System.out.println("Employees before sort");
        for (Employee e:employees){
            System.out.println(e);
        }
        System.out.println("------------------------");
        System.out.println("Employees sort by id");
        Collections.sort(employees);
        for (Employee e:employees){
            System.out.println(e);
        }
        System.out.println("------------------------");
        System.out.println("Employees sort by name");
        Collections.sort(employees, new EmployeeNameComparator());
        for (Employee e:employees){
            System.out.println(e);
        }
        System.out.println("------------------------");
        System.out.println("Employees sort by age");
        Collections.sort(employees, new EmployeeAgeComparator());
        for (Employee e:employees){
            System.out.println(e);
        }
        System.out.println("------------------------");
        System.out.println("Employees sort by salary");
        Collections.sort(employees, new EmployeeSalaryComparator());
        for (Employee e:employees){
            System.out.println(e);
        }
        System.out.println("------------------------");
        System.out.println("Employees sort by ageAndThenName");
        Collections.sort(employees, new EmployeeAgeAndThanNameComparator());
        for (Employee e:employees){
            System.out.println(e);
        }

    }
}
/*Employees before sort
1 Mike 23 4000
4 Linn 23 4500
6 Rick 43 6000
5 Leo 33 5000
9 Lisa 42 6500
------------------------
Employees sort by id
1 Mike 23 4000
4 Linn 23 4500
5 Leo 33 5000
6 Rick 43 6000
9 Lisa 42 6500
------------------------
Employees sort by name
5 Leo 33 5000
4 Linn 23 4500
9 Lisa 42 6500
1 Mike 23 4000
6 Rick 43 6000
------------------------
Employees sort by age
4 Linn 23 4500
1 Mike 23 4000
5 Leo 33 5000
9 Lisa 42 6500
6 Rick 43 6000
------------------------
Employees sort by salary
1 Mike 23 4000
4 Linn 23 4500
5 Leo 33 5000
6 Rick 43 6000
9 Lisa 42 6500
------------------------
Employees sort by ageAndThenName
4 Linn 23 4500
1 Mike 23 4000
5 Leo 33 5000
9 Lisa 42 6500
6 Rick 43 6000
* */
