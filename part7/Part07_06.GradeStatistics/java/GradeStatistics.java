/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GradeStatistics {
    private ArrayList<Integer> points;
    private Scanner scanner;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void add() {
        System.out.println("Enter points totals, -1 stops");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input < 0 || input > 100) {
                continue;
            }
            points.add(input);
        }
    }

    public int sum() {
        int sum = 0;
        for (int var : points) {
            sum += var;
        }
        return sum;
    }

    public double average() {
        return sum() * 1.0 / points.size();
    }

    public GradeStatistics passed() {
        GradeStatistics accumulator = new GradeStatistics();
        for (int var : points) {
            if (var >= 50) {
                accumulator.points.add(var);
            }
        }
        return accumulator;
    }

    public double averageOfPass() {
        return (passed().average());
    }

    public String matcher() {
        if (averageOfPass() > 0) {
            return String.valueOf(averageOfPass());
        }
        return "-";
    }

    public double passPercentage() {
        return passed().points.size() * 100.00 / points.size();
    }

    // GradeStatistics -> [Array of Numbers]
    // converts the list of points into a list of grades.
    // [50,60,70,80] -> [0,1,2,3]....
    public GradeStatistics convertToGrades() {
        GradeStatistics ga = new GradeStatistics();

        for (int i = 0; i < points.size(); i++) {
            int var = points.get(i);
            if (var < 50) {
                ga.points.add(0);
            } else if (var < 60) {
                ga.points.add(1);
            } else if (var < 70) {
                ga.points.add(2);
            } else if (var < 80) {
                ga.points.add(3);
            } else if (var < 90) {
                ga.points.add(4);
            } else {
                ga.points.add(5);
            }
        }
        return ga;
    }

    public void printGradesAsStars() {
        int grades = 5;
        int sum = 0;
        while (grades >= 0) {
            for (int var : convertToGrades().points) {
                if (var == grades) {
                    sum++;
                }
            }
            System.out.print(grades + ": ");
            while (sum > 0) {
                System.out.print("*");
                sum--;
            }
            System.out.println("");
            grades--;
        }
    }
}