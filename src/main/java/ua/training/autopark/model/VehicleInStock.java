package ua.training.autopark.model;

/**
 * This interface declares main methods for all vehicles selling on market.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 18.04.2019
 */
public interface VehicleInStock {
    String getBrandAndModel();

    int getPrice();
}
