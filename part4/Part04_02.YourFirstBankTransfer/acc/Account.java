package acc;

public class Account {
    private  String  owner;
    private  double balance;
    public Account (String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }
    public void withdraw (double amount){
        this.balance =this.balance - amount;
    }
    public void deposit (double amount) {
        this.balance = this.balance + amount;
    }
    public  double balance (){
        return this.balance;
    }
    @Override
    public String toString(){
        return this.owner + " balance : " + this.balance;
    }

}