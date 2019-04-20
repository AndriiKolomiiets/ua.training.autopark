package ua.training.autopark.model;

/**
 * This class defines main methods for car instances.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 16.04.2019
 */
public abstract class CarInStock implements VehicleInStock {

    public abstract int getSpeedLimit();

    public abstract double getFuelRate();

    public String toString() {
        return "- " + getClass().getSimpleName() + " with model name: " + getBrandAndModel() + " has next characteristics:\nSpeed limit: "
                + getSpeedLimit() + ". Fuel rate: " + getFuelRate() + "\nThe car costs: " + getPrice();
    }

}
