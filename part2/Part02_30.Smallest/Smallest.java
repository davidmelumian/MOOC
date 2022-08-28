
public class Smallest {
    public static void main(String[] args) {
        int answer= smallest(2,7);
        System.out.println("Smallest: " + answer);
    }
    public static int smallest(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}