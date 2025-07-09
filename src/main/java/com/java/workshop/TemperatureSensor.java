package com.java.workshop;

public class TemperatureSensor  {
    private float temperature;

    public TemperatureSensor(float atemperature){
        temperature = atemperature;
    }
    public float getReading(){
        return temperature; 
    }
}
