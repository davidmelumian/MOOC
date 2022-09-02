public class PaymentCard {
    private double balance;

    public PaymentCard(double initBalance) {
        this.balance = initBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance - 2.60 < 0) {
            return;
        }
        this.balance = this.balance - 2.60;
    }

    public void eatHeartily() {
        if (this.balance - 4.60 < 0) {
            return;
        }
        this.balance = this.balance - 4.60;
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            return;
        } else if (this.balance + amount > 150) {
            this.balance = 150;
        } else {
            this.balance = this.balance + amount;
        }
    }
}