/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.controller;

import basics_of_OOP.Task4.model.Service;

public abstract class State {

    Service service;

    State(Service service){
        this.service = service;
    }

    abstract void printTheMostExpensiveTreasure();
    abstract void printTreasureByCost(int cost);
    abstract void printAllTreasures();
    abstract boolean exit();
    abstract void nextPage();
    abstract void previousPage();
    abstract void printChoices();
}
