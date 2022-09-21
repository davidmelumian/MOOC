
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(var->var.split(","))

                    .map(parts -> new Statistics(parts[3],Integer.valueOf(parts[4]),parts[2].replace("(%)","").trim(),Double.valueOf(parts[5])))
                    .sorted((p1,p2) -> {
                        if (p1.getRate() == p2.getRate()) {
                            return 0;
                        } else if (p1.getRate() > p2.getRate()) {
                            return 1;
                        } else {
                            return -1;
                        }
                    })
                    .forEach(var-> System.out.println(var));
            } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
