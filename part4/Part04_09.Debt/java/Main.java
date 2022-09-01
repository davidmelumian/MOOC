
public class Main {

    public static void main(String[] args) {
           Debt  debt = new Debt(120000,0.01);
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        for(int years = 0 ; years< 20; years++ ){
            debt.waitOneYear();
        }
        debt.printBalance();
    }
}
