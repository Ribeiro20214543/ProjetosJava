package com.patrickfrr;

public class Car {
    public int potency;
    int speed;
    String name;

    public void  speedUp(){
        speed = speed + potency;
    }

    public void brake() {
        speed = speed / 2;
    }

    public int getSpeed() {
        return speed;
    }
    void print(){
        System.out.println("O carro "+name+" está a velocidade de "+getSpeed()+" Km/h");
    }
}
