import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Film matrix = new Film("The matrix", 16);
        Scanner scanner =new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.println();
        if (age>= matrix.ageRating()){
            System.out.println("You may watch this film " +matrix.name());
        } else {
            System.out.println("You may not watch this film " + matrix.name());
        }
    }
}
