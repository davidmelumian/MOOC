
public class Main {

  public static void main(String[] args) {
    Song pastel = new Song("Pastel Sunset",180);
        Song dive  = new Song("Krosia - Dive" , 200);
        System.out.println("The song " + pastel.name() + " has a length of " +pastel.length() + " seconds");
        System.out.println("The song " +dive.name() + " has a length of " +dive.length() + " seconds");

  }
}
