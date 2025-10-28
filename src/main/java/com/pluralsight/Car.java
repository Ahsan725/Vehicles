package com.pluralsight;

public class Car extends Vehicle {

    public Car(String color, int numOfPassenger, int cargoCapacity, int fuelCapacity) {
        super(color, numOfPassenger, cargoCapacity, fuelCapacity);
        setTopSpeed(300);
        setAccelerationCapacity(25);
        setFuelConsumption(2);  // cars burn a bit more per accelerate
        setFuelLevel(0);        // starts empty so I need to call refuel() before driving
    }

    @Override
    public void start() {
        System.out.println("The car has started!");
        setSpeed(0);
    }

    @Override
    public void stop(){
        System.out.println("The car has stopped!");
        setSpeed(0);
    }

    @Override
    public void accelerate(){
        if (getSpeed() >= getTopSpeed()){
            System.out.println("It is already at top speed!");
            return;
        }
        if (getFuelLevel() <= 0) {
            System.out.println("Fuel is empty!");
            stop();
            return;
        }
        setSpeed(Math.min(getTopSpeed(), getSpeed() + getAccelerationCapacity()));
        setFuelLevel(getFuelLevel() - Math.max(1, getFuelConsumption()));
        if (getFuelLevel() == 0) {
            System.out.println("Fuel ran out!");
            stop();
        }
    }

    @Override
    public void refuel(int fuelAmount){
        super.refuel(fuelAmount);
    }

    @Override
    public String toString() {
        return "Car{" +
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
