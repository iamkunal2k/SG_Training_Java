package LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

public class LambdaEx2 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kunal", 22));
        employees.add((new Employee("Krishna", 21)));
        employees.add((new Employee("KKK", 18)));

        Collections.sort(employees, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        for (int i= 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
