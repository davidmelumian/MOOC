
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> list = new ArrayList<>();
        while (true){
            System.out.println("Enter the first name, empty will  end loop");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Enter the last name  of the person  " +  name + ": ");
            String  lastName = (scanner.nextLine());

            System.out.println("Enter the identification number: " + name + ": " + lastName + " : ");
            String  number = (scanner.nextLine());

            list.add(new PersonalInformation(name,lastName,number));
        }

        for (int i =0; i<list.size(); i++){
            System.out.println((list.get(i).getFirstName()) + " "  + (list.get(i).getLastName()));
        }
    }
}