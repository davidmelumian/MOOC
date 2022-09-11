/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> stringStringHashMap;

    public Abbreviations() {
        this.stringStringHashMap = new HashMap<>();
    }

    public static String convert(String string) {
        string = string.toLowerCase();
        return string.trim();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        stringStringHashMap.put(convert(abbreviation), explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return stringStringHashMap.containsKey(convert(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
       
            return stringStringHashMap.get(convert(abbreviation));
    }
}