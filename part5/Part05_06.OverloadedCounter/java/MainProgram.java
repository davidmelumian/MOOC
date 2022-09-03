
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(30);
        Counter altcounter = new Counter();
        counter.increase();
        altcounter.increase();
        System.out.println(counter);
        System.out.println(altcounter);
        counter.decrease();
        altcounter.decrease(-5);
        System.out.println(counter);
        System.out.println(altcounter);
    }
}
