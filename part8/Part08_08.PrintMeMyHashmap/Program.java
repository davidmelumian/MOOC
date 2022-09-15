
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
    // HashMap -> Keys
    // prints all keys
    public static void  printKeys(HashMap <String,String> hashMap){
        for (String element:hashMap.keySet()){
            System.out.println(element);
        }
    }
    // HashMap  String -> Keys
    // prints all keys  that contains the name.
    public static void printKeysWhere(HashMap<String,String> hashMap,String text) {
        for (String element : hashMap.keySet()) {
            if (element.contains(text)) {
                System.out.println(element);
            }
        }
    }
    // HashMap String ->  Values
    // prints all values,which keys contain the name.
    public static void printValuesOfKeysWhere (HashMap<String,String> hashMap,String text){
        for (String element:hashMap.keySet()){
            if (element.contains(text)){
                System.out.println(hashMap.get(element));
            }
        }
    }
}
