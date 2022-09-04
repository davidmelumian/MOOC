
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }
        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        // if the years and the months are the same,compare days
        if (this.year == compared.year && this.month ==compared.month &&
                this.day < compared.day) {
            return true;
        }
        return false;
    }
    public void advance(){
        if (this.month == 12 &&
            this.day == 30){
            this.year ++;
            this.month=1;
            this.day=1;
            return;
        }
        if (this.day == 30){
            this.day = 1;
            this.month++;
            return;
        }
        this.day++;
    }
    public void advance (int howManyDays){
        for (int i = howManyDays; i>0; i--){
            advance();
        }
    }
    public boolean equals (Object compared){
        if (this==compared){
            return true;
        }
        if (!(compared instanceof  SimpleDate)){
            return false;
        }
        SimpleDate comparedDate = (SimpleDate) compared;
        if (this.day==comparedDate.day&&
            this.month==comparedDate.month&&
            this.year==comparedDate.year){
            return true;
        }
        return false;
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate clone = new SimpleDate(day,month,year);
        clone.advance(days);
        return clone;
    }
}

