package org.lasencinas.main;


import org.lasencinas.interfaces.Heatable;
import org.lasencinas.interfaces.Temperable;
import org.lasencinas.person.Girl;
import org.lasencinas.items.Heater;
import org.lasencinas.items.Regulator;
import org.lasencinas.items.Thermometer;
import org.lasencinas.room.RoomTemperature;

public class Main {
    public static void main(String[] args) {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = new RoomTemperature(15);
        Heatable heater = new Heater();
        Temperable thermometer = new Thermometer();

        Regulator regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Girl moza = new Girl();
        System.out.println("\nArrancando a la moza: ");
        regulator.regulate(thermometer, moza, minTemp, maxTemp, temperature);
        moza.speak();
    }
}
