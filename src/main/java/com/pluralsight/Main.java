package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("red", 4, 4, 100);
        vehicle.setTopSpeed(120);
        vehicle.setAccelerationCapacity(10);
        vehicle.setFuelConsumption(1);   // 1 unit per 10 miles
        vehicle.setFuelLevel(10);        // start with 10 units

        Car car = new Car("black", 4, 2, 200);
        car.setFuelConsumption(2);       // 2 units per 10 miles (burns faster)
        car.setFuelLevel(6);             // less fuel to force earlier refuels

        vehicle.start();
        car.start();

        System.out.println("\nVEHICLE DRIVING");
        int miles = 0;
        while (miles < 100) {
            if (vehicle.getFuelLevel() <= 0) {
                System.out.println("Out of fuel → refuel +5");
                vehicle.refuel(5);       // smaller refuel for Vehicle
            }
            miles += 10;
            System.out.println("Traveled " + miles + " miles");
            vehicle.accelerate();        // consumes fuel internally
        }
        vehicle.stop();

        System.out.println("\nCAR DRIVING");
        int carMiles = 0;
        while (carMiles < 100) {
            if (car.getFuelLevel() <= 0) {
                System.out.println("Out of fuel → refuel +8");
                car.refuel(8);           // bigger refuel for Car
            }
            carMiles += 10;
            System.out.println("Traveled " + carMiles + " miles");
            car.accelerate();            // consumes more fuel than Vehicle
        }
        car.stop();

        System.out.println("\nAFTER TRIP");
        System.out.println(vehicle);
        System.out.println(car);
    }
}
