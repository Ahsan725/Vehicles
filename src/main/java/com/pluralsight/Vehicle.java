package com.pluralsight;

public class Vehicle {
    private String color;
    private int numOfPassenger;
    private int cargoCapacity;
    private int fuelCapacity;
    private int topSpeed;
    private int speed;
    private int accelerationCapacity;
    private int fuelLevel;
    private int fuelConsumption;

    public Vehicle(String color, int numOfPassenger, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numOfPassenger = numOfPassenger;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAccelerationCapacity() {
        return accelerationCapacity;
    }

    public void setAccelerationCapacity(int accelerationCapacity) {
        this.accelerationCapacity = accelerationCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void start(){
        System.out.println("The vehicle has started!");
        this.speed = 0;
        this.accelerationCapacity = 10;
        this.topSpeed = 100;
    }

    public void stop(){
        System.out.println("The vehicle has stopped!");
        this.speed = 0;
    }
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

    public void refuel(int fuelAmount){
        if (fuelAmount + this.fuelLevel <= this.fuelCapacity){
            this.fuelLevel += fuelAmount;
        }else{
            System.out.println("above fuel capacity can not refuel!");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numOfPassenger=" + numOfPassenger +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                ", speed=" + speed +
                ", accelerationCapacity=" + accelerationCapacity +
                ", fuelLevel=" + fuelLevel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
