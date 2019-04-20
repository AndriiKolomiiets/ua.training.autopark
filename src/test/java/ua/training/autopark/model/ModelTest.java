package ua.training.autopark.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ModelTest {
    Sedan sedan;
    Hatchback hatchback;
    SportCar sportCar;
    Autopark autopark;
    Model model;
    int numberOfSportCars;
    int numberOfSedans;
    int numberOfHatchbacks;
    ArrayList<CarInStock> autoparkCarsTestArray;

    @Before
    public void setUp() throws Exception {
        model = new Model();
        sedan = new Sedan("sedan", 40000, 200, 6.0);
        numberOfSedans = 1;
        hatchback = new Hatchback("hatchback", 20000, 150, 4.0);
        numberOfHatchbacks = 1;
        sportCar = new SportCar("sportcar", 140000, 300, 10.0);
        numberOfSportCars = 1;
        autopark = new Autopark(sportCar, numberOfSportCars, hatchback, numberOfSedans, sedan, numberOfHatchbacks);

        autoparkCarsTestArray = new ArrayList<>();
        autoparkCarsTestArray.add(sportCar);
        autoparkCarsTestArray.add(sedan);
        autoparkCarsTestArray.add(hatchback);
    }

    @Test
    public void getAutoparkCost() {
        long autoparkCost = model.getAutoparkCost(autopark);
        assertEquals(200000, autoparkCost);
    }

    @Test
    public void getAutoparkCarsSortedArray() {
        ArrayList<CarInStock> autoparkCarsArray = model.getAutoparkCarsSortedArray(autopark);
        assertEquals(autoparkCarsTestArray, autoparkCarsArray);
    }

    @Test
    public void getCarBySpeedLimitRange() {
        CarInStock testCar = model.getCarBySpeedLimitRange(autopark, "1");
        assertEquals(hatchback, testCar);
    }
}
