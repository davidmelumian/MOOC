
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

    }
    public static void printValues (HashMap<String,Book> hashMap){
        for (Book var:hashMap.values()){
            System.out.println(var);
        }
    }
    public  static  void printValueIfNameContains (HashMap<String,Book> hashMap,String text){
        for (Book var:hashMap.values()){
            if (var.getName().contains(text)){
                System.out.println(var);
            }
        }
    }
}