package org.lasencinas.interfaces;

import org.lasencinas.room.RoomTemperature;

public interface Temperable {

    /* ---- Behaviours ---- */
    default double read(RoomTemperature roomTemperature){
        return roomTemperature.getTemperature();
    }
}
