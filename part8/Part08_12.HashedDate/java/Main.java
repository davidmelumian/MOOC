
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1,2,2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5,2,2002)));
        System.out.println(d.equals(new SimpleDate(1,2,2000)));
        System.out.println(d.hashCode() ==(new SimpleDate(1,2,2001)).hashCode());

    }
}
