package org.lasencinas.room;

public class RoomTemperature {
    /* ---- Properties of the class ---- */
    private final RoomTemperature INSTANCE = new RoomTemperature();
    private double temperature = 0d;


    /* ---- Constructor ---- */
    public RoomTemperature() {
    }

    public RoomTemperature(double temperature) {
        this.temperature = temperature;
    }


    /* ---- Getters ---- */
    public RoomTemperature getInstance() {
        return INSTANCE;
    }

    public double getTemperature() {
        return temperature;
    }
}
