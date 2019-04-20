package ua.training.autopark.model;

/**
 * Data base imitation is used to minimize user input in defining Sedan, Hatchback and SportCar classes.
 * Data from this class can't be modified.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 19.04.2019
 * @see Sedan
 * @see Hatchback
 * @see SportCar
 */
public enum ParkOfAvailableCars {
    SPORT_CAR("Jaguar FX", 140000, 310, 14.6),
    SEDAN("Ford Mondeo", 40000, 197, 8.1),
    HATCHBACK("Ford Fusion", 15000, 170, 6.3);

    private final int price;
    private final String brand;
    private final int speedLimit;
    private final double fuelRate;


    public int getSpeedLimit() {
        return speedLimit;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    ParkOfAvailableCars(String brand, int price, int speedLimit, double fuelRate) {
        this.brand = brand;
        this.price = price;
        this.speedLimit = speedLimit;
        this.fuelRate = fuelRate;
    }

}

