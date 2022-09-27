/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author david
 */
public class Flight {

    private Airplane Airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane Airplane, Place departureAirport, Place targetAirport) {
        this.Airplane = Airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane() {
        return this.Airplane;
    }

    public Place getDeparturePlace() {
        return this.departureAirport;
    }

    public Place getTargetPlace() {
        return this.targetAirport;
    }

    @Override
    public String toString() {
        return this.Airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}