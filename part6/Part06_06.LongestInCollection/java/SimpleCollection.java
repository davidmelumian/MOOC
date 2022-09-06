
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        int size = elements.size();
        String pre = "";
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (size == 1) {
            pre = "The collection " + this.name + " has " + size + " element: ";
        } else {
            pre = "The collection " + this.name + " has " + size + " elements: ";
        }

        String list = "";
        for (String var : elements) {
            list += "\n" + var;
        }
        return pre + list;
    }

    public String longest() {
        int count = 0;
        String longest = "";
        if (this.elements.isEmpty()) {
            return null;
        }
        while (count <this.elements.size()) {
            if (longest.length() <= this.elements.get(count).length()) {
                longest = this.elements.get(count);
            }
            count++;
        }
        return longest;
    }
}
