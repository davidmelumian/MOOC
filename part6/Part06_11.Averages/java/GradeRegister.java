
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister(){
        this.grades= new ArrayList<>();
        this.examPoints=new ArrayList<>();
    }
    public static int pointsToGrades(int points){
        int grade = 0;
        if (points<50){
            grade =0;
        } else if (points<60) {
            grade=1;
        } else if (points<70) {
            grade=2;
        } else if (points<80) {
            grade=3;
        } else if (points<90) {
            grade=4;
        } else {
            grade=5;
        }
        return grade;
    }
    public void addGradeBasedOnPoints (int points){
        this.grades.add(pointsToGrades(points));
        this.examPoints.add(points);
    }
    public int numberOfGrades (int grade){
        int count = 0;
        for (int var:this.grades){
            if (var==grade){
                count++;
            }
        }
        return count;
    }
    public double averageOfGrades(){
        if (this.grades.isEmpty()){
            return -1;
        }
        int sum = 0;
        for (int var: grades){
            sum += var;
        }
        return  1.0*sum/this.grades.size();
    }
    public double averageOfPoints(){
        if (this.examPoints.isEmpty()){
            return -1;
        }
        int sum =0;
        for (int var: examPoints){
            sum +=var;
        }
        return 1.0*sum/this.examPoints.size();
    }
}
