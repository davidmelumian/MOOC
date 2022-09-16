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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.get(licensePlate) == null) {
            owners.put(licensePlate,owner);
            return true;
        }
        return false;
    }
    // LicensePlate -> Owner or null
    // prints the owner of the given plate. if plate is not found, return null
    public String get(LicensePlate licensePlate){
        return  owners.get(licensePlate);
    }
    // LicensePlate -> True or False
    // removes the license plate from the hashmap. produces true if successfully, or false if it was not found
    public boolean remove (LicensePlate licensePlate){
        if (owners.containsKey(licensePlate)){
            owners.remove(licensePlate);
            return  true;
        }
        return false;
    }
     public void printLicensePlates(){
        for (LicensePlate element:owners.keySet()){
            System.out.println(element);
        }
    }
    public void printOwners() {
        ArrayList<String> names = new ArrayList<>();
        for (String element : owners.values()) {
            if (names.contains(element)) {
                continue;
            }
            names.add(element);
        }
        for (String element: names){
            System.out.println(element);
        }
    }
}
