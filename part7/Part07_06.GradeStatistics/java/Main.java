
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeStatistics gradeStatistics = new GradeStatistics();
        gradeStatistics.add();
        System.out.println("Point average (all): " + gradeStatistics.average());
        System.out.println("Point average (passing):" + gradeStatistics.matcher());
        System.out.println("Pass percentage: " + gradeStatistics.passPercentage());
        gradeStatistics.convertToGrades();
        gradeStatistics.printGradesAsStars();
    }
}
    