

public class Agent {
    private String firstName;
    private String lastName;
    public Agent (String initialFirstName,String initialLastName){
        this.firstName=initialFirstName;
        this.lastName=initialLastName;
    }
    public String toString (){
        return  "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}