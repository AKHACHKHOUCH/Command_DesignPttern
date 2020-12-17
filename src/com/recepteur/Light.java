package com.recepteur;

public class Light implements Device {
    public void on() {
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is off");
    }
}
