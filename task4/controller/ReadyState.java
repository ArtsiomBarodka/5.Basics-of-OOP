/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.controller;

import basics_of_OOP.Task4.model.Service;

public class ReadyState extends State {

    public ReadyState(Service service) {
        super(service);
    }

    @Override
    void printTheMostExpensiveTreasure() {
        service.changeState(new TheMostExpensiveState(service));
    }

    @Override
    void printTreasureByCost(int cost) {
        service.changeState(new TreasureByCostState(service,cost));
    }

    @Override
    void printAllTreasures() {
        service.changeState(new AllTreasuresState(service));
    }

    @Override
    boolean exit() {
        return false;
    }

    @Override
    void nextPage() {

    }

    @Override
    void previousPage() {

    }

    @Override
    void printChoices() {
        System.out.println("===========================================");
        System.out.println("0 - Выход\n" +
                "3 - Сокровище на заданную сумму\n" +
                "4 - Самое дорогое сокровище\n" +
                "5 - Все сокровища");
    }
}
