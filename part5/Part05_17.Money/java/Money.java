public class Money {
    private final int euros;
    private final int cents;
    public Money (int euros,int cents){
        if (cents>99){
            euros = euros + cents /100;
            cents = cents %100;
        }
        this.euros=euros;
        this.cents=cents;
    }
    public int  euros(){
        return this.euros;
    }
    public int cents (){
        return this.cents;
    }
    public Money plus (Money addition){
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if (newCents>99){
            newEuros++;
            newCents-= 100;
        }
        return new Money(newEuros,newCents);
    }
    public boolean lessThan (Money compared){
        if (this.euros<compared.euros){
            return true;
        }
        if (this.euros == compared.euros &&
            this.cents < compared.cents){
            return true;
        }
        return false;
    }
    public Money minus (Money decreaser){
        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;
        if (newCents < 0){
            newEuros--;
            newCents+=100;
        }
        if (newEuros<0){
            newEuros=0;
            newCents=0;
        }
        Money newMoney = new Money(newEuros,newCents);
        return newMoney;
    }
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}