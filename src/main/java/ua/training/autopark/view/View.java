package ua.training.autopark.view;

import ua.training.autopark.model.Autopark;
import ua.training.autopark.model.CarInStock;
import ua.training.autopark.model.VehicleInStock;

import java.util.ArrayList;

/**
 * This class displays messages and result information on console.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 18.04.2019
 */
public class View {

    public void printMessage(String message) {
        System.out.println("\n" + message);
    }

    public void printArray(ArrayList<CarInStock> arrayList) {
        for (CarInStock car : arrayList) {
            System.out.println(car);
        }
    }

    public void printTheCarBrand(VehicleInStock car) {
        System.out.println(car.getBrandAndModel());
    }

    public void printMessage(long message) {
        System.out.println(message);
    }

    public void printAutopark(Autopark autopark) {
        System.out.println(autopark + "\n");
    }
}
