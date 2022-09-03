
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();
        int count = 0;
        int win = 0;
        int loss = 0;
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                //System.out.println(homeTeam + "," + visitingTeam + "," + homePoints + "," + visitPoints);
                if ((team.equals(homeTeam)) || (team.equals(visitingTeam))) {
                    count++;
                }
                if (((team.equals(homeTeam)) && (homePoints) > (visitPoints))
                        || (team.equals(visitingTeam)) && (homePoints) < (visitPoints)) {
                    win++;
                } else if (((team.equals(homeTeam)) && (homePoints) < (visitPoints))
                        || (team.equals(visitingTeam)) && (homePoints) > (visitPoints)) {
                    loss++;
                }
            }
        } catch (Exception e) {
            System.out.println("File " + e.getMessage() + " was not found");

        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }
}