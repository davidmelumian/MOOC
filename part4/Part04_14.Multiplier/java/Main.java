public class Main {
    public static void main(String[] args) {
        Multiplier by3 = new Multiplier(3);
        System.out.println("by 3 " + by3.multiply(2));
        Multiplier by5 = new Multiplier(5);
        System.out.println("by 4 " + by5.multiply(6));
    }
}
