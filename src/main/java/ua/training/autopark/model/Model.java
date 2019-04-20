package ua.training.autopark.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/**
 * This class contains and proceed all application logic.
 * It gets user input from Controller and Display result with View.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 20.04.2019
 * @see ua.training.autopark.controller.Controller
 * @see ua.training.autopark.view.View
 */
public class Model {

    public static final String SEDAN_TYPE = "sedan";
    public static final String HATCHBACK_TYPE = "hatchback";
    public static final String SPORTCAR_TYPE = "sport-car";
    private AutoparkFactory autoparkFactory;

    public Model() {
        autoparkFactory = new AutoparkFactory();
    }

    public void setHatchbackToAutopark(Autopark autopark, String numberOfHatchbacksUserInput) {
        autopark.setHatchback(autoparkFactory.getAuto(HATCHBACK_TYPE));
        int numberOfHatchbacks = Integer.parseInt(numberOfHatchbacksUserInput);
        autopark.setNumberOfHatchbacks(numberOfHatchbacks);
    }

    public void setSedanToAutopark(Autopark autopark, String numberOfSedansUserInput) {
        autopark.setSedan(autoparkFactory.getAuto(SEDAN_TYPE));
        int numberOfSedans = Integer.parseInt(numberOfSedansUserInput);
        autopark.setNumberOfSedans(numberOfSedans);
    }

    public void setSportcarToAutopark(Autopark autopark, String numberOfSportcarsUserInput) {
        autopark.setSportCar(autoparkFactory.getAuto(SPORTCAR_TYPE));
        int numberOfSportcars = Integer.parseInt(numberOfSportcarsUserInput);
        autopark.setNumberOfSportCars(numberOfSportcars);
    }

    public long getAutoparkCost(Autopark autopark) {
        int sportcarCost = autopark.getSportCar().getPrice() * autopark.getNumberOfSportCars();
        int sedanCost = autopark.getSedan().getPrice() * autopark.getNumberOfSedans();
        int hatchbackCost = autopark.getHatchback().getPrice() * autopark.getNumberOfSportCars();
        return sportcarCost + sedanCost + hatchbackCost;
    }

    public ArrayList getAutoparkCarsArray(Autopark autopark) {
        ArrayList<CarInStock> autoparkCarsArray = new ArrayList<>();
        autoparkCarsArray.add(autopark.getHatchback());
        autoparkCarsArray.add(autopark.getSedan());
        autoparkCarsArray.add(autopark.getSportCar());
        return autoparkCarsArray;
    }

    public ArrayList getAutoparkCarsSortedArray(Autopark autopark) {
        ArrayList autoparkCarsSortedArray = new ArrayList(getAutoparkCarsArray(autopark));
        autoparkCarsSortedArray.sort(Comparator.comparingDouble(CarInStock::getFuelRate).reversed());
        return autoparkCarsSortedArray;
    }

    /**
     * This method is modified to simplify user input and to make it minimal.
     */
    public CarInStock getCarBySpeedLimitRange(Autopark autopark, String speedRangeInput) {

        int speedRange = Integer.parseInt(speedRangeInput);
        Optional<CarInStock> matchingCar;
        ArrayList<CarInStock> autoparkCarsArray = getAutoparkCarsArray(autopark);

        switch (speedRange) {
            case (1):
                matchingCar = autoparkCarsArray.stream().
                        filter(car -> car.getSpeedLimit() <= 180).
                        findFirst();
                return matchingCar.get();
            case (2):
                matchingCar = autoparkCarsArray.stream().
                        filter(car -> car.getSpeedLimit() > 180).
                        filter(car -> car.getSpeedLimit() < 200).
                        findFirst();
                return matchingCar.get();
            case (3):
                matchingCar = autoparkCarsArray.stream().
                        filter(car -> car.getSpeedLimit() >= 200).
                        findFirst();
                return matchingCar.get();
            default:
                throw new IllegalArgumentException();

        }
    }
}
