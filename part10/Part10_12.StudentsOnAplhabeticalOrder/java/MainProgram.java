

import java.util.ArrayList;
public class MainProgram {

    public static void main(String[] args) {
     ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Cyan"));
        students.add(new Student("Aval"));
        students.add(new Student("Blank"));
        System.out.println(students);
        
        
        // we do not even need to implement the interface comparable and do any extra stuff.
        // Since String implements the Comparable by default (set by language designer)
        // it is possible to get a sorted result in ascending order with following command:
//        students.stream()
//                .map(student -> student.getName())
//                .sorted()
//                .forEach(var -> System.out.println(var));
    }
}
