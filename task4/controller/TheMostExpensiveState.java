/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.controller;

import basics_of_OOP.Task4.model.Service;

class TheMostExpensiveState extends State {

    TheMostExpensiveState(Service service) {
        super(service);
        service.setPage(1);
        printTheMostExpensiveTreasure();
    }

    @Override
    void printTheMostExpensiveTreasure() {
        service.getTheMostExpensiveTreasure();
    }

    @Override
    void printTreasureByCost(int cost) {

    }

    @Override
    void printAllTreasures() {

    }

    @Override
    boolean exit() {
        service.changeState(new ReadyState(service));
        return true;
    }

    @Override
    void nextPage() {
        service.setPage(service.getPage()+1);
        printTheMostExpensiveTreasure();
    }

    @Override
    void previousPage() {
        if(service.getPage() != 1){
            service.setPage(service.getPage()-1);
        }
        printTheMostExpensiveTreasure();
    }

    @Override
    void printChoices() {
        System.out.println("===========================================");
        System.out.println("0 - Выход в главное меню\n" +
                "1 - Следующая страница\n" +
                "2 - Предыдущая страница");
    }
}
