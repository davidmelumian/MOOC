package  acc;
public class YourFirstAccount {
    public static void main(String[] args) {
        Account matt = new Account("Matthew's account",1000);
        Account my = new Account("My account", 0.0);
        System.out.println(matt);
        System.out.println(my);
        System.out.println("====================");
        matt.withdraw(100);
        System.out.println(matt);
        System.out.println("==================");
        my.deposit(100);
        System.out.println(my);
        System.out.println("==================");
    }
}