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
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature, 0.5);

        /**
         * Calentando => temperatura 15.5
         * Calentando => temperatura 16.0
         * Calentando => temperatura 16.5
         * Calentando => temperatura 17.0
         * Calentando => temperatura 17.5
         * Calentando => temperatura 18.0
         * Calentando => temperatura 18.5
         * Calentando => temperatura 19.0
         * Calentando => temperatura 19.5
         * Calentando => temperatura 20.0
         * Calentando => temperatura 20.5
         * Calentando => temperatura 21.0
         * Apagado => temperatura 20.5
         * Apagado => temperatura 20.0
         * Apagado => temperatura 19.5
         * Apagado => temperatura 19.0
         * Apagado => temperatura 18.5
         * Apagado => temperatura 18.0
         * Apagado => temperatura 17.5
         * Apagado => temperatura 17.0
         * Apagado => temperatura 16.5
         * Apagado => temperatura 16.0
         * Apagado => temperatura 15.5
         * Apagado => temperatura 15.0
         */

        Man gañán = new Man();
        Girl moza = new Girl();

        System.out.println("Precalentando...");
        gañán.speak();

        regulator.regulate(gañán, moza, minTemp, maxTemp, temperature, 1.5);
        /* In the line of code above, it is demonstrated that dependency injection works with 2 different objects
        with the same interface implementation.
         */
        System.out.println('\n' + "¡Ignición!");
        moza.speak();

        /**
         * The man says:
         *    Let's do it!
         *
         * Calentando => temperatura 16.5
         * Calentando => temperatura 18.0
         * Calentando => temperatura 19.5
         * Calentando => temperatura 21.0
         * Apagado => temperatura 19.5
         * Apagado => temperatura 18.0
         * Apagado => temperatura 16.5
         * Apagado => temperatura 15.0
         *
         * ¡Ignición!
         * The girl says:
         *    Oh my gosh!
         */
    }
}
