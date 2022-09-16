
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    public boolean equals (Object object){
        // does variable are the same
        if (this == object){
            return  true;
        }
        // does the object is an instance of SimpleDate
        if (!(object instanceof  SimpleDate)){
            return  false;
        }
        // convert an object to the object of SimpleDate
        SimpleDate var = (SimpleDate) object;
        if (this.year==var.year &&
                this.month==var.month &&
                this.day==var.day){
            return  true;
        }
        return  false;
    }
    

}
