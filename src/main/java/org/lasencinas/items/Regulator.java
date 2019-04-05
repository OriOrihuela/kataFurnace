package org.lasencinas.items;

import org.lasencinas.interfaces.Heatable;
import org.lasencinas.interfaces.Regulable;
import org.lasencinas.interfaces.Temperable;
import org.lasencinas.room.RoomTemperature;

public class Regulator implements Regulable {

    /* ---- Behaviours ---- */
    public void regulate(Temperable temperable, Heatable heatable, double minTemp, double maxTemp,
                         RoomTemperature roomTemperature) {

    }
}
