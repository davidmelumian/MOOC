
public class PaymentTerminal {
    private double money; // the amount of cash
    private int affordableMeals; // numbers of sold affordable meals
    private int heartyMeals; // numbers of sold hearty meals
    public PaymentTerminal(){
        this.money=1000;
    }
    public double eatAffordably (double payment){
        double cost = 2.50;
        if (payment<cost) {
            return payment;
        }
        this.money+=cost;
        this.affordableMeals++;
        return  payment-cost;
    }
    public double eatHeartily(double payment){
        double cost = 4.30;
        if (payment<cost){
            return payment;
        }
        this.money+=cost;
        this.heartyMeals++;
        return payment-cost;
    }

    public double getMoney() {
        return money;
    }
    public String toString(){
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    public boolean eatAffordably(PaymentCard card){
        double cost = 2.50;
        if (card.balance()>=cost){
            card.takeMoney(2.50);
            this.affordableMeals++;
            return true;
        }
        return false;
    }
    public boolean eatHeartily (PaymentCard card){
        double cost = 4.30;
        if (card.balance()>=cost){
            card.takeMoney(4.30);
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card,double sum){
        if (sum<=0){
            return;
        }
        this.money+=sum;
        card.addMoney(sum);
    }
}