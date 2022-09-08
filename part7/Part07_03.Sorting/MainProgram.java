import java.util.Arrays;
public class MainProgram {
    // Array of Numbers -> Number
    //determines the smallest number
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    // [Array of Numbers] - > Index
    // returns the index of the smallest number.
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        while (index < array.length) {
            if (smallest(array) == array[index]) {
                break;
            }
            index++;
        }
        return index;
    }

    // [Array of Numbers] Index  -> Index
    // returns the index of the smallest  number, starting from the given index;
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex]; //returns a value that is  stored on the given index;
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            if ((table[i] <= min)) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }
    //[Array of numbers] Index Index -> [Array of Numbers]
    // swaps the values of given indexes
    public static void swap (int []array,int index1, int index2){
        int helper = array[index1];
        array[index1]= array[index2];
        array[index2]=helper;
    }
    //[Array of Numbers] -> [Array of Numbers]
    // sorts the given array in the ascending order
    public static void sort (int [] array){
        System.out.print("Before sort:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            swap(array,i , indexOfSmallestFrom(array, i));

            System.out.println("After first sort " + Arrays.toString(array));

        }

    }
}
