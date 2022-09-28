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
import java.util.Random;

public class TemperatureSensor implements  Sensor {
    private boolean status;

    public TemperatureSensor(){
        this.status=false;

    }

    public boolean isStatus() {
        return status;
    }


    @Override
    public boolean isOn() {
        return isStatus();
    }

    @Override
    public void setOn() {
        this.status=true;

    }

    @Override
    public void setOff() {
        this.status=false;

    }

    @Override
    public int read() {
        Random random = new Random();
        return  random.nextInt(31)- random.nextInt(31);
    }
}
