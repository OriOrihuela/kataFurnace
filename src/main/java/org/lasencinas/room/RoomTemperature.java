package org.lasencinas.room;

public class RoomTemperature {

    /* ---- Properties of the class ---- */
    private static RoomTemperature ROOM_TEMPERATURE;
    private double temperature;


    /* ---- Constructor ---- */
    private RoomTemperature(double temperature) {
        this.temperature = temperature;
    }


    /* ---- Getters ---- */
    public double getTemperature() {
        return temperature;
    }


    /* ---- Behaviours ---- */
    public static synchronized RoomTemperature setRoomTemperature(double temperature) {
        if (ROOM_TEMPERATURE == null) {
            ROOM_TEMPERATURE = new RoomTemperature(temperature);
        } else {
            System.out.println("Cannot create another RoomTemperature object!");
        }
        return ROOM_TEMPERATURE;
    }

    public void addGrades(double grade) {
        this.temperature += grade;
    }

    public void subtractGrades(double grades) {
        this.temperature -= grades;
    }
}
