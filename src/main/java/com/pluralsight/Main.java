package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("red", 4, 4, 100);
        System.out.println(vehicle);

        Car car = new Car("black", 4, 2, 200);
        System.out.println(car);

        vehicle.refuel(50);
        vehicle.start();
        vehicle.accelerate();
        System.out.println(vehicle);

        car.refuel(25);
        car.start();
        car.accelerate();
        System.out.println(car);


    }
}
