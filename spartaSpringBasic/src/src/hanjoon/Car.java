package hanjoon;

import java.util.Scanner;

public class Car {
    String color;
    String brand;
    Integer maxSpeed;
    Integer currentSpeed;
    Integer fuel;
    public Car(String intputColor1,String brand,Integer maxSpeed,Integer fuel){
        this.color = intputColor1;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
        currentSpeed = 0;
    }

    public void accel(){
        this.currentSpeed += 1;
    }

    public void brake(){
        this.currentSpeed -= 1;
    }
}

