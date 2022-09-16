
import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;
    public LicensePlate(String country,String liNumber){
        this.liNumber=liNumber;
        this.country=country;
    }
    @Override
    public String toString(){
        return country + " " + liNumber;
    }
    @Override
    public boolean equals (Object object){
        // does variables located in the same location
        if (this==object){
            return true;
        }
        // does object is the instance of LicensePlate?
        if (!(object instanceof LicensePlate)){
            return false;
        }
        // convert an Object Type to LicensePlate type
        LicensePlate var = (LicensePlate) object ;

        // comparing equality of values
        if (this.liNumber.equals(var.liNumber)&&(this.country.equals(var.country))){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
}
