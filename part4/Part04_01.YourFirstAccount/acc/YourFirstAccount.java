package learn;

public class YourFirstAccount {
    public static void main(String[] args) {
        Account davidsAccount = new Account("David's account", 100.00);
        System.out.println("Initial state");
        System.out.println(davidsAccount);//печать инстанции
        davidsAccount.deposit(20.0); //применение метода, который изменяет значение (перезаписывает переменную) баланса.
        System.out.println("The balance of David's account is now " + davidsAccount.balance());
        System.out.println("End state");
        System.out.println(davidsAccount);//печать инстанции
    }

}
