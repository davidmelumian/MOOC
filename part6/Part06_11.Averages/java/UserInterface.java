
import java.util.Scanner;

public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int score = Integer.valueOf(input);
            if (score < 0 || score > 100) {
                System.out.println("Impossible number.");
                continue;
            }
            this.register.addGradeBasedOnPoints(score);
        }
    }
    public void printGradeDistribution(){
        int grade=5;
        while (grade>= 0){
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
    }
    public static void printStars(int stars){
        while (stars>0){
            System.out.print("*");
            stars--;
        }
    }
}

