package org.lasencinas.interfaces;

import org.lasencinas.room.RoomTemperature;

public interface Heatable {

    /* ---- Behaviours ---- */
    default double engage(RoomTemperature roomTemperature, double grades) {
        roomTemperature.addGrades(grades);
        return roomTemperature.getTemperature();
    }

    default double disengage(RoomTemperature roomTemperature, double grades) {
        roomTemperature.subtractGrades(grades);
        return roomTemperature.getTemperature();
    }
}
