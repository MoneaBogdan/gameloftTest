package com.example.gameloft.model;

public class Device {
    private int id;
    private String model;
    private String carrier;
    private String firmware;

    public Device(int id, String model, String carrier, String firmware) {
        super();
        this.id = id;
        this.model = model;
        this.carrier = carrier;
        this.firmware = firmware;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }
}
