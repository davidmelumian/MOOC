/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatiana
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner,SimpleDictionary dictionary){
        this.scanner=scanner;
        this.dictionary=dictionary;
    }
    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            if (input.equals("add")){
                System.out.print("Word: ");
                String key = scanner.nextLine();
                System.out.print("Translation: ");
                String value = scanner.nextLine();
                dictionary.add(key,value);
                continue;
            }
            if (input.equals("search")){
                System.out.print("To be translated: ");
                String keyID= scanner.nextLine();
                if (dictionary.translations.containsKey(keyID)) {
                    System.out.println("Translation: " + dictionary.translate(keyID));
                    continue;
                }
                System.out.println("Word " + keyID + " was not found");
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye-bye!");
    }

}