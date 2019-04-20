package ua.training.autopark.controller;

import ua.training.autopark.view.View;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class get user input and checks it with regular expressions.
 *
 * @author Andrii Kolomiiets
 * @version 1.0 16.04.2019
 */

public class InputController {


    /**
     * getAndCheckUserInput method get user input with scanner and check input with regular expressions.
     *
     * @param inputMessage - message user sees before the input starts
     * @param regexp       - regular expression for checking user input
     * @param reader       - example of class InputReader via BufferedReader for getting user input from console
     * @param view         - instance of View class from the Controller
     * @return user input.
     */
    public String getAndCheckUserInput(String inputMessage, String regexp, BufferedReader reader,
                                       View view) throws IOException {
        String input;
        while (true) {
            view.printMessage(inputMessage);
            input = reader.readLine();
            if (input.matches(regexp)) {
                return input;
            } else {
                throw new IOException();
            }
        }
    }


}
