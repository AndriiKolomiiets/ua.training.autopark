package ua.training.autopark;

import ua.training.autopark.controller.Controller;
import ua.training.autopark.model.Model;
import ua.training.autopark.view.View;

/**
 * This is a start class on the application.
 * It runs Controller to get user input and display messages and Model to make program logic.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 20.04.2019
 * @see Controller
 * @see Model
 */
public class AutoparkMVC {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller autoparkController = new Controller(model, view);
        autoparkController.processUser();
    }
}
