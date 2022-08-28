
public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);

    }

    public static int greatest(int first, int second, int third) {
        int value = (Math.max(first, second));

        if (value > third) {
            return value;
        } else {
            return third;
        }
    }
}