package org.lasencinas.main;


import org.lasencinas.interfaces.Heatable;
import org.lasencinas.interfaces.Temperable;
import org.lasencinas.person.Man;
import org.lasencinas.person.Girl;
import org.lasencinas.items.Heater;
import org.lasencinas.items.Regulator;
import org.lasencinas.items.Thermometer;
import org.lasencinas.room.RoomTemperature;

public class Main {
    public static void main(String[] args) {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.setRoomTemperature(15);
        /* If we try to create another RoomTemperature instance, a message will be displayed alerting us it will not
           be possible
         */

        Heatable heater = new Heater();
        Temperable thermometer = new Thermometer();

        Regulator regulator = new Regulator();

        System.out.println("Precalentando...\n");
        System.out.println(temperature.getTemperature());
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        System.out.println("¡Ignición!");

        Man man = new Man();
        Girl moza = new Girl();

        System.out.println("\nEjecución finalizada: ");
        regulator.regulate(man, moza, minTemp, maxTemp, temperature);
        moza.speak();
    }
}
