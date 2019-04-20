package ua.training.autopark.controller;

import ua.training.autopark.model.Autopark;
import ua.training.autopark.model.Model;
import ua.training.autopark.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class is used to process user input, manage exceptions while getting data from user and calls Model.
 * @see Model - process data and make program logic. Model write data to Autopark.
 * @see Autopark
 *
 * Controller calls View for displaying messages and results.
 * @see View
 *
 * @author Andrii Kolomiiets
 * @version 1.0 13.04.2019
 */
public class Controller {
    public static final String PROPERTIES_EN = "message_and_regexp_en_GB";
    public static final String PROPERTIES_UA = "message_and_regexp_uk_UA";
    public static final String LOCALE_INPUT_MESSAGE = "locale.input.message";
    public static final String WRONG_INPUT_MESSAGE = "wrong.input.message";
    public static final String START_MESSAGE = "start.message";
    public static final String CHOICE_REGEXP = "choice.regexp";
    public static final String RANGE_CHOICE_REGEXP = "range.choice.regexp";
    public static final String HATCHBACK_INPUT_MESSAGE = "hatchback.number.message";
    public static final String SEDAN_INPUT_MESSAGE = "sedan.number.message";
    public static final String SPOTRCAR_INPUT_MESSAGE = "sportcar.number.message";
    public static final String AUTOPARK_COST_MESSAGE = "autopark.cost.message";
    public static final String SORTED_CARS_MESSAGE = "sorted.cars.message";
    public static final String SPEED_RANGE_INPUT_MESSAGE = "speed.range.input.message";
    public static final String SPEED_RANGE_RESULT_MESSAGE = "speed.range.result.message";
    public static final String AUTOPARK_RESULT_MESSAGE = "autopark.result.message";

    private Model model;
    private View view;
    private Autopark autopark;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle(PROPERTIES_EN, new Locale("en", "GB"));
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        autopark = new Autopark();
    }

    public void processUser() {

        setLocale();
        InputController inputController = new InputController();

        view.printMessage(resourceBundle.getString(START_MESSAGE));

        String numberOfHatchbacksUserInput = getUserInput(resourceBundle.getString(HATCHBACK_INPUT_MESSAGE),
                resourceBundle.getString(CHOICE_REGEXP), reader, view, inputController);
        model.setHatchbackToAutopark(autopark,numberOfHatchbacksUserInput);

        String numberOfSedansUserInput = getUserInput(resourceBundle.getString(SEDAN_INPUT_MESSAGE),
                resourceBundle.getString(CHOICE_REGEXP), reader, view, inputController);
        model.setSedanToAutopark(autopark,numberOfSedansUserInput);

        String numberOfSportcarsUserInput = getUserInput(resourceBundle.getString(SPOTRCAR_INPUT_MESSAGE),
                resourceBundle.getString(CHOICE_REGEXP), reader, view, inputController);
        model.setSportcarToAutopark(autopark,numberOfSportcarsUserInput);

        view.printMessage(resourceBundle.getString(AUTOPARK_COST_MESSAGE) + model.getAutoparkCost(autopark));

        view.printMessage(resourceBundle.getString(SORTED_CARS_MESSAGE));
        view.printArray(model.getAutoparkCarsSortedArray(autopark));

        String rangeChoiceInput = getUserInput(resourceBundle.getString(SPEED_RANGE_INPUT_MESSAGE),
                resourceBundle.getString(RANGE_CHOICE_REGEXP), reader, view, inputController);

        view.printMessage(resourceBundle.getString(SPEED_RANGE_RESULT_MESSAGE) +
                model.getCarBySpeedLimitRange(autopark,rangeChoiceInput));

        view.printMessage(resourceBundle.getString(AUTOPARK_RESULT_MESSAGE));
        view.printAutopark(autopark);
    }

    /**
     * This method changes program`s locale.
     */
    private void setLocale() {
        view.printMessage(resourceBundle.getString(LOCALE_INPUT_MESSAGE));

        try {
            String locale = reader.readLine();
            if (locale.equalsIgnoreCase("ua")) {
                this.resourceBundle = ResourceBundle.getBundle(PROPERTIES_UA, new UTF8Control());
            } else {
                this.resourceBundle = ResourceBundle.getBundle(PROPERTIES_EN);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    * This method handles exceptions and repeat the input method.
    * */
    private String getUserInput(String inputMessage, String regexp, BufferedReader reader, View view, InputController inputOutput) {

        while (true) {
            try {
                return inputOutput.getAndCheckUserInput(inputMessage, regexp, reader, view);
            } catch (IOException e) {
                view.printMessage(resourceBundle.getString(WRONG_INPUT_MESSAGE));
            }
        }
    }
}
