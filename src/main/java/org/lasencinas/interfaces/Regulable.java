package org.lasencinas.interfaces;

import org.lasencinas.room.RoomTemperature;

public interface Regulable {
    void regulate(Temperable temperable, Heatable heatable, double minTemp, double maxTemp,
                  RoomTemperature roomTemperature);
}
