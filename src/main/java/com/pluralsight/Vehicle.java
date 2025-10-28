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
    private int fuelConsumption; // units of fuel used per accelerate()

    public Vehicle(String color, int numOfPassenger, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numOfPassenger = numOfPassenger;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        // reasonable defaults
        this.topSpeed = 100;
        this.accelerationCapacity = 10;
        this.fuelLevel = 0;
        this.fuelConsumption = 1;
        this.speed = 0;
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
        this.speed = Math.max(0, speed);
    }

    public int getAccelerationCapacity() {
        return accelerationCapacity;
    }

    public void setAccelerationCapacity(int accelerationCapacity) {
        this.accelerationCapacity = Math.max(0, accelerationCapacity);
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
        this.fuelCapacity = Math.max(0, fuelCapacity);
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = Math.max(0, Math.min(fuelLevel, fuelCapacity));
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = Math.max(0, fuelConsumption);
    }

    public void start() {
        System.out.println("The vehicle has started!");
        this.speed = 0;
    }

    public void stop() {
        System.out.println("The vehicle has stopped!");
        this.speed = 0;
    }

    public void accelerate() {
        if (speed >= topSpeed) {
            System.out.println("It is already at top speed!");
            return;
        }
        if (fuelLevel <= 0) {
            System.out.println("Fuel is empty!");
            stop();
            return;
        }
        // accelerate and burn fuel
        speed = Math.min(topSpeed, speed + accelerationCapacity);
        int newFuel = fuelLevel - Math.max(1, fuelConsumption);
        fuelLevel = Math.max(0, newFuel);
        if (fuelLevel == 0) {
            System.out.println("Fuel ran out!");
            stop();
        }
    }

    public void refuel(int fuelAmount) {
        if (fuelAmount <= 0) {
            System.out.println("Refuel amount must be positive.");
            return;
        }
        if (fuelLevel + fuelAmount <= fuelCapacity) {
            fuelLevel += fuelAmount;
        } else {
            fuelLevel = fuelCapacity;
            System.out.println("Tank is full so extra fuel did not fit.");
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
