
import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;
    public SimpleCollection(String name){
        this.name=name;
        this.elements=new ArrayList<>();
    }
    public void add (String element){
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString () {
        int size = this.elements.size();
        if (size == 0) {
            return "The collection " + this.name + " is empty.";
        }
        String pre = "";
        if (size == 1) {
            pre = "The collection " + this.name + " has " + size + " element:";
        } else {
            pre = "The collection " + this.name + " has " + size + " elements:";
        }

        String avar = "";
        for (String var:elements) {
          avar+= "\n" + var;
        }

        return  pre + avar;
    }

}
