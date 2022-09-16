/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        if (dictionary.containsKey(word)) {
            dictionary.put(word, dictionary.get(word)).add(translation);
        }
    }
    public void print(){
        for (String element:dictionary.keySet()){
            System.out.print(element);
            System.out.print(dictionary.get(element));
            System.out.println();
        }
    }

    public ArrayList<String> translate (String word) {
        if (dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return  dictionary.get(word);
    }
    public void remove (String word){
        if (dictionary.containsKey(word)){
            dictionary.remove(word);
        }
    }
}