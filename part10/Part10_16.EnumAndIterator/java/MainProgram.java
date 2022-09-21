import java.util.Collections;

public class MainProgram {
    public static void main(String[] args) {
        Employees employees= new Employees();
        Person david = new Person("David",Education.HS);
        Person anna = new Person("Anna",Education.PHD);
        Person jeff = new Person("Jeff",Education.BA);
        Person john = new Person("John", Education.MA);
        Person elon = new Person("Elon",Education.PHD);
        Person katya = new Person("Katya",Education.HS);
        Person alex = new Person("Alex",Education.MA);
        Collections.addAll(employees.getPeople(),david,anna,jeff,john,elon,katya,alex);
        employees.print(Education.PHD);
        employees.fire(Education.HS);
        System.out.println("==");
        employees.print();

    }

}