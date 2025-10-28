package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("red", 4, 4, 100);
        vehicle.setTopSpeed(120);
        vehicle.setAccelerationCapacity(10);
        vehicle.setFuelConsumption(1);
        vehicle.setFuelLevel(10);

        Car car = new Car("black", 4, 2, 200);
        car.setFuelConsumption(2);
        car.setFuelLevel(6);

        vehicle.start();
        car.start();

        System.out.println("\nVEHICLE DRIVING");
        int miles = 0;
        while (miles < 100) {
            if (vehicle.getFuelLevel() <= 0) {
                System.out.println("Out of fuel → refuel +5");
                vehicle.refuel(5);
            }
            miles += 10;
            System.out.println("Traveled " + miles + " miles");
            vehicle.accelerate();
        }
        vehicle.stop();

        System.out.println("\nCAR DRIVING");
        int carMiles = 0;
        while (carMiles < 100) {
            if (car.getFuelLevel() <= 0) {
                System.out.println("Out of fuel → refuel +8");
                car.refuel(8);
            }
            carMiles += 10;
            System.out.println("Traveled " + carMiles + " miles");
            car.accelerate();
        }
        car.stop();

        System.out.println("\nAFTER TRIP");
        System.out.println(vehicle);
        System.out.println(car);
    }
}
