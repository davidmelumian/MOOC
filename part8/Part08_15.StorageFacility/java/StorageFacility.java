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

public class StorageFacility {
    private HashMap<String, ArrayList<String>> items;

    public StorageFacility() {
        this.items = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.items.putIfAbsent(unit, new ArrayList<>());
        this.items.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> item = this.items.get(storageUnit);
        if (item==null) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        return item;
    }

    public void remove(String storageUnit, String item) {
        items.get(storageUnit).remove(item);
        if (this.items.get(storageUnit).size()==0){
            this.items.remove (storageUnit);
        }
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String var : items.keySet()) {
            list.add(var);
        }
        return list;
    }
}
