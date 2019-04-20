package ua.training.autopark.model;

/**
 * This class is an instance of CarInStock class.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 20.04.2019
 * @see CarInStock
 * POJO class.
 */
public class Sedan extends CarInStock {

    private String brandAndModel;
    private int price;
    private int speedLimit;
    private double fuelRate;

    public Sedan() {
        brandAndModel = "Ford Mondeo";
        price = 40000;
        speedLimit = 197;
        fuelRate = 8.1;
    }

    public Sedan(ParkOfAvailableCars car) {
        brandAndModel = car.getBrand();
        price = car.getPrice();
        speedLimit = car.getSpeedLimit();
        fuelRate = car.getFuelRate();
    }

    public Sedan(String brand, int price, int speedLimit, double fuelRate) {
        this.brandAndModel = brand;
        this.price = price;
        this.speedLimit = speedLimit;
        this.fuelRate = fuelRate;
    }

    @Override
    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public double getFuelRate() {
        return fuelRate;
    }

    @Override
    public String getBrandAndModel() {
        return brandAndModel;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
