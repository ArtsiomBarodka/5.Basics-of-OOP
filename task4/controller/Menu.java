/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.controller;

import basics_of_OOP.Task4.model.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private Service service;
    private boolean isNotExit;


    public Menu(Service service) {
        this.service = service;
        isNotExit = true;
    }

    public void run(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (isNotExit){
                service.getState().printChoices();
                String choice = reader.readLine();
                switch (choice){
                    case "0":
                        isNotExit = service.getState().exit();
                        break;

                    case "1":
                        service.getState().nextPage();
                        break;

                    case "2":
                        service.getState().previousPage();
                        break;

                    case "3":
                        do {
                            System.out.println("Введите сумму ");
                            choice = reader.readLine();
                        } while (!isNumeric(choice));
                        service.getState().printTreasureByCost(Integer.parseInt(choice));
                        break;

                    case "4":
                        service.getState().printTheMostExpensiveTreasure();
                        break;

                    case "5":
                        service.getState().printAllTreasures();
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isNumeric(String string) {
        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }
}
