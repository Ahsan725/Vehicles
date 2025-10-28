package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //vehicle test
        Vehicle vehicle = new Vehicle("red", 4, 4, 100);
        System.out.println(vehicle);

        //moped test
        Moped moped = new Moped("Green", 2, 0, 200);
        System.out.println(moped);

        Car car = new Car("black", 4, 2, 200);
        System.out.println(car);

        //Semi
        SemiTruck semi = new SemiTruck("blue", 2, 20, 350);
        System.out.println(semi);

        //start vehicle
        vehicle.start();
        vehicle.accelerate();

        //start car
        car.start();
        car.accelerate();

    }
}