import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDemoWithGeneric {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(10 , "Vaibhav");
        Student s2 = new Student(25, "Akash");

        Employee e1 = new Employee(111,"Ramesh");
        Employee e2 = new Employee(211, "Akash");
        Employee e3 = new Employee(311, "Karthik");
        studentList.add(s1);
        studentList.add(s2);



        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(studentList);
        System.out.println("Sorted-------------------------");
        Comparator<Student> studentComparator = (o1,o2) -> {
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(studentList, studentComparator);
        System.out.println(studentList);

        System.out.println("emp ---------------");
        System.out.println(employeeList);
        System.out.println("Sorted-------------------------");
        Collections.sort(employeeList, (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
        System.out.println(employeeList);




    }
}
