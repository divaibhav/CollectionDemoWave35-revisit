import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//without generic
public class ListDemo {
    public static void main(String[] args) {

        List studentList = new ArrayList();
        Student s1 = new Student(10 , "Vaibhav");
        Student s2 = new Student(25, "Vikas");

        Employee e1 = new Employee(111,"Ramesh");
        Employee e2 = new Employee(211, "Suresh");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(e1);
        studentList.add(e2);
        studentList.add("abc");

        System.out.println(studentList);

        //search for student having roll no = 25;
        for (int i = 0; i < studentList.size(); i++) {
            //type checking
            if(studentList.get(i) instanceof Student) {
                Student temp = (Student) studentList.get(i);
                if (temp.getRollNo() == 25) {
                    System.out.println(temp);
                }
            }
        }

        Iterator itr = studentList.iterator();
        while (itr.hasNext()){
            Object object = itr.next();
            if(object instanceof Student){
                System.out.println(((Student) object).getRollNo() );
                System.out.println(((Student) object).getName() );

            }
            else {
                System.out.println(((Employee) object).getEmpId());
                System.out.println(((Employee) object).getEmpName());
            }
        }
    }
}
