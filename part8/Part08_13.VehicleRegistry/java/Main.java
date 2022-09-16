
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        LicensePlate li1 = new LicensePlate("UA", "AA2412AO");
        LicensePlate li2 = new LicensePlate("UA", "BA9423");

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        System.out.println(vehicleRegistry.add(new LicensePlate("UA","AA2412AO"),"Andrey"));
        System.out.println(vehicleRegistry.add(new LicensePlate("UA","AA2412AO"), "boris"));
        System.out.println(vehicleRegistry.add(li2,"David"));
        System.out.println( vehicleRegistry.get(li1));
        System.out.println(vehicleRegistry.remove(li1));
        vehicleRegistry.printLicensePlates();
        vehicleRegistry.printOwners();
    }
}
