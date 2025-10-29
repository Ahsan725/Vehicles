package com.pluralsight;

public class SpaceShip extends Vehicle {
    public SpaceShip(String color, int numOfPassenger, int cargoCapacity, int fuelCapacity) {
        super(color, numOfPassenger, cargoCapacity, fuelCapacity);
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "color='" + getColor() + '\'' +
                ", numOfPassenger=" + getNumOfPassenger() +
                ", cargoCapacity=" + getCargoCapacity() +
                ", fuelCapacity=" + getFuelCapacity() +
                ", topSpeed=" + getTopSpeed() +
                ", speed=" + getSpeed() +
                ", accelerationCapacity=" + getAccelerationCapacity() +
                ", fuelLevel=" + getFuelLevel() +
                ", fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
