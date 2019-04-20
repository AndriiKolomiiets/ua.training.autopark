package ua.training.autopark.model;

public class Autopark {
    private SportCar sportCar;
    private Hatchback hatchback;
    private Sedan sedan;
    private int numberOfSedans;
    private int numberOfHatchbacks;
    private int numberOfSportCars;
   /* private ArrayList<CarInStock> autoparkCarsArray;
    private ArrayList autoparkCarsSortedArray;*/

    /**
     * This class stores data of user autopark.
     *
     * @author Andrii Kolomiiets
     * @version 1.0 18.04.2019
     */
    public Autopark(SportCar sportCar, int numberOfSportCars, Hatchback hatchback, int numberOfSedans, Sedan sedan, int numberOfHatchbacks) {
        this.sportCar = sportCar;
        this.sedan = sedan;
        this.hatchback = hatchback;
        this.numberOfSportCars = numberOfSportCars;
        this.numberOfSedans = numberOfSedans;
        this.numberOfHatchbacks = numberOfHatchbacks;
    }

    public Autopark() {
    }

    public SportCar getSportCar() {
        return sportCar;
    }

    public void setSportCar(CarInStock sportCar) {
        this.sportCar = (SportCar) sportCar;
    }

    public Hatchback getHatchback() {
        return hatchback;
    }

    public void setHatchback(CarInStock hatchback) {
        this.hatchback = (Hatchback) hatchback;
    }

    public Sedan getSedan() {
        return sedan;
    }

    public void setSedan(CarInStock sedan) {
        this.sedan = (Sedan) sedan;
    }

    public int getNumberOfSedans() {
        return numberOfSedans;
    }

    public void setNumberOfSedans(int numberOfSedans) {
        this.numberOfSedans = numberOfSedans;
    }

    public int getNumberOfHatchbacks() {
        return numberOfHatchbacks;
    }

    public void setNumberOfHatchbacks(int numberOfHatchbacks) {
        this.numberOfHatchbacks = numberOfHatchbacks;
    }

    public int getNumberOfSportCars() {
        return numberOfSportCars;
    }

    public void setNumberOfSportCars(int numberOfSportCars) {
        this.numberOfSportCars = numberOfSportCars;
    }


    @Override
    public String toString() {
        return getHatchback().getBrandAndModel() + ": " + getNumberOfHatchbacks() + "\n"
                + getSedan().getBrandAndModel() + ": " + getNumberOfSedans() + "\n"
                + getSportCar().getBrandAndModel() + ": " + getNumberOfSportCars();
    }
}
