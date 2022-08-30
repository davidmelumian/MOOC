
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("Give two indicces to swap:");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        int helper = array[index1];
         array [index1] = array[index2];
         array [index2] = helper;

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
}

/* this is my solution. array is created by user input. However, i cannot use it,because tests won't pass.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements an array should have?: ");
        int elements = Integer.valueOf(scanner.nextLine());
        int [] numbers = new int[elements];
        while (true){
            System.out.println("type an index ");
            int index = Integer.valueOf(scanner.nextLine());
            if (index == 123){
                break;
            }
            System.out.println("assign the value");
            int value = Integer.valueOf(scanner.nextLine());
            numbers [index] = value;
            System.out.println("The index " + index +  " and value " + value + " was added to the array");
            System.out.println("The array consist of: " + numbers );
        }
        System.out.println("Give two indexes to swap");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        int helper = numbers [index1];
        numbers[index1]= numbers[index2];
        numbers[index2] = helper;

        for (int var:numbers){
            System.out.println(var);
        }
    }
}
*/
