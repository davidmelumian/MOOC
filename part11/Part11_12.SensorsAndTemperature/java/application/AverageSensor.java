/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Tatiana
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements  Sensor {
    private List<Sensor> sensors;
    private List <Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (int i = 0; i < sensors.size(); i++) {
            if (Boolean.valueOf(sensors.get(i).isOn()).equals(false)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (int i = 0; i < sensors.size(); i++) {
            sensors.get(i).setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor e : sensors) {
            e.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        if (!this.isOn() || this.sensors.size() == 0) {
            throw new IllegalStateException();
        }

        for (Sensor e : sensors) {
            sum += e.read();
        }
        sum = Math.round(sum / sensors.size());
        readings().add(sum);
        return sum;
        

    }

    @Override
    public String  toString() {
        StringBuilder builder = new StringBuilder();
        sensors.stream().map(var->var.isOn()).forEach(var-> builder.append(var).append(" "));
       String a =  builder.toString();
        return a;
    }
    
  public List <Integer> readings(){
        return readings;
    }

}
