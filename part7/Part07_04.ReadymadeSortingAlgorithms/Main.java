import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {10,2,500,8,20,-1};
        String [] strings = {"z", "x", "y", "c"};
        ArrayList<Integer> lon = new ArrayList<>();
        ArrayList<String> los = new ArrayList<>();
        lon.add(10);
        lon.add(50);
        lon.add(20);
        lon.add(80);
        lon.add(30);
        los.add("hello");
        los.add("golovach");
        los.add("maverick");
         sort(numbers);
         sort(strings);
         sortIntegers(lon);
         sortStrings(los);
    }
    public static  void  sort(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void  sort(String [] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
    }
    public static void sortStrings (ArrayList<String> strings){
        Collections.sort(strings);
        System.out.println(strings);
    }

}