package org.lasencinas.items;

import org.lasencinas.codes.Codes;
import org.lasencinas.interfaces.Heatable;
import org.lasencinas.interfaces.Regulable;
import org.lasencinas.interfaces.Temperable;
import org.lasencinas.room.RoomTemperature;

public class Regulator implements Regulable {

    /* ---- Behaviours ---- */
    public void regulate(Temperable temperable, Heatable heatable, double minTemp, double maxTemp,
                         RoomTemperature roomTemperature, double grades) {
        Codes code;
        while (temperable.read(roomTemperature) < maxTemp) {
            code = Codes.HEATING;
            heatable.engage(roomTemperature, grades);
            message(code, roomTemperature);
        }
        while (temperable.read(roomTemperature) > minTemp) {
            code = Codes.WAITING;
            heatable.disengage(roomTemperature, grades);
            message(code, roomTemperature);
        }
    }

    private void message(Codes code, RoomTemperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Calentando => temperatura " + temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Apagado => temperatura " + temperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }
}
