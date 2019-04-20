package ua.training.autopark.model;

/**
 * This class is an example of AbstractFactory pattern.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 18.04.2019
 * @return car type instance
 */
public class AutoparkFactory {

    public CarInStock getAuto(String carType) {
        switch (carType) {
            case ("sport-car"):
                return new SportCar(ParkOfAvailableCars.SPORT_CAR);
            case ("sedan"):
                return new Sedan(ParkOfAvailableCars.SEDAN);
            case ("hatchback"):
                return new Hatchback(ParkOfAvailableCars.HATCHBACK);
            default:
                return null;
        }
    }
}
