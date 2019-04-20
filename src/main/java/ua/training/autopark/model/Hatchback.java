package ua.training.autopark.model;

/**
 * This class is an instance of CarInStock class.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 20.04.2019
 * @see CarInStock
 * POJO class.
 */
public class Hatchback extends CarInStock {
    private String brandAndModel;
    private int price;
    private int speedLimit = 180;
    private double fuelRate = 5.4;

    public Hatchback() {
        brandAndModel = "Ford Fusion";
        price = 15000;
        speedLimit = 170;
        fuelRate = 6.3;
    }

    public Hatchback(ParkOfAvailableCars car) {
        brandAndModel = car.getBrand();
        price = car.getPrice();
        speedLimit = car.getSpeedLimit();
        fuelRate = car.getFuelRate();
    }

    public Hatchback(String brand, int price, int speedLimit, double fuelRate) {
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
