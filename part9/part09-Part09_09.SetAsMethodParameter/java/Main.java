
import java.util.*;
public class Main {

    public static void main(String[] args) {
          Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("three");
        names.add("four");
        names.add("three");
        System.out.println(names);


    }
    public static  int returnSize(Set sets){
      return sets.size();
    }

}
