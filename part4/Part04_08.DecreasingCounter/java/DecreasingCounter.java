
public class DecreasingCounter {
    private int value; // a variable that remembers the value of the counter.

    public DecreasingCounter(int initialvalue) {
        this.value = initialvalue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value <= 0) {
            this.value = 0;
        } else {
            this.value--;
        }
    }
    public void reset (){
        this.value=0;
    }
}