package org.lasencinas.interfaces;

import org.lasencinas.room.RoomTemperature;

public interface Regulable {

    /* ---- Behaviours ---- */
    default void regulate(Temperable temperable, Heatable heatable, double minTemp, double maxTemp,
                  RoomTemperature roomTemperature) {
        // The body of the method that each regulator will overwrite according to its operation.
    }
}
