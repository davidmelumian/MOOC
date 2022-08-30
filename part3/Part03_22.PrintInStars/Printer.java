
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printStars(int star){
        for (int i = 0; i<star; i++){
            System.out.print("*");
        }
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int var:array){
            printStars(var);
            System.out.println();
        }
    }

}
