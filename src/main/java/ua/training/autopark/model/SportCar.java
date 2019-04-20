package ua.training.autopark.model;

/**
 * This class is an instance of CarInStock class.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 20.04.2019
 * @see CarInStock
 * POJO class.
 */
public class SportCar extends CarInStock {
    private String brandAndModel;
    private int price;
    private int speedLimit;
    private double fuelRate;

    public SportCar() {
        brandAndModel = "Jaguar FX";
        price = 140000;
        speedLimit = 310;
        fuelRate = 14.6;
    }

    public SportCar(ParkOfAvailableCars car) {
        brandAndModel = car.getBrand();
        price = car.getPrice();
        speedLimit = car.getSpeedLimit();
        fuelRate = car.getFuelRate();
    }

    public SportCar (String brand, int price, int speedLimit, double fuelRate) {
        this.brandAndModel = brand;
        this.price = price;
        this.speedLimit = speedLimit;
        this.fuelRate = fuelRate;
    }

    @Override
    public String getBrandAndModel() {
        return brandAndModel;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public double getFuelRate() {
        return fuelRate;
    }

}
