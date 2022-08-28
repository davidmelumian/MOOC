
public class Averaging {
    public static void main(String[] args) {
        System.out.println("Average: " + average(4,3,6,1) );
    }
    public static int  sum (int first, int second, int third, int fourth){
        int result = first + second + third +fourth;
        return  result;
    }
    public static double average (int first, int second,int third, int fourth){
        int sum = sum(first,second,third,fourth);
        double avg= sum/4.0;
        return  avg;
    }
}