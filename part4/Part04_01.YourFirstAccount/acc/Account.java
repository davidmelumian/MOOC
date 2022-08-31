package learn;

public class Account {  // создание класса. модификатор public - говорит о том, что класс и все его содержимое видно остальным классам, при условии, что модификаторы не приват
   private String  owner; //  декларирование типа переменной. переменная доступна только внутри класса.
   private double balance;
  public  Account(String owner,double balance){ //условие для входа в тело конструктора. Конструктор должен содержать два значения соответсвующих типов
     this.owner=owner; // - перезапись текущего значения переменной, на заданное в  условии конструктора
     this.balance = balance;
  }
  public void deposit (double amount) {  // создание метода, который ничего не возвращает. метод перезаписывает значение переменной balance
     this.balance= this.balance + amount;
  }
  public void withdraw(double amount){  // создание метода, который ничего не возвращает. метод перезаписывает значение переменной balance
     this.balance= this.balance - amount;
  }
  public double  balance (){    // метод, который возвращает текущий баланс
     return  this.balance;
  }
  @Override
   public String toString(){ // перезапись метода, чтобы избавиться от хешей в консоле при печати.
     return this.owner + " balance: " + this.balance;
  }
}