package com.pluralsight;

public class Car extends Vehicle {

    public Car(String color, int numOfPassenger, int cargoCapacity, int fuelCapacity) {
        super(color, numOfPassenger, cargoCapacity, fuelCapacity);
    }

    @Override
    public void start() {
        System.out.println("The vehicle has started!");
        this.setSpeed(0);
        this.setAccelerationCapacity(25);
        this.setTopSpeed(300);

    }
    @Override
    public void stop(){
        System.out.println("The vehicle has stopped!");
        this.speed = 0;
    }
    @Override
    public void accelerate(){
        if (this.speed >= topSpeed){
            System.out.println("It is already at top speed!");
        }
        else if (fuelLevel < 0) {
            System.out.println("Fuel is empty!");
            stop();
        }else{
            this.speed += getAccelerationCapacity();
            fuelLevel -= fuelConsumption;
        }
    }
@Override
    public void refuel(int fuelAmount){
        if (fuelAmount + this.fuelLevel <= this.fuelCapacity){
            this.fuelLevel += fuelAmount;
        }else{
            System.out.println("above fuel capacity can not refuel!");
        }
    }
}
