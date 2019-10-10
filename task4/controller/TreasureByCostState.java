/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.controller;

import basics_of_OOP.Task4.model.Service;

class TreasureByCostState extends State {

    private int cost;

    TreasureByCostState(Service service, int cost) {
        super(service);
        service.setPage(1);
        this.cost = cost;
        printTreasureByCost(cost);
    }

    @Override
    void printTheMostExpensiveTreasure() {

    }

    @Override
    void printTreasureByCost(int cost) {
        service.getTreasureByCost(cost);
    }

    @Override
    void printAllTreasures() {

    }

    @Override
    protected boolean exit() {
        service.changeState(new ReadyState(service));
        return true;
    }

    @Override
    void nextPage() {
        service.setPage(service.getPage()+1);
        printTreasureByCost(cost);
    }

    @Override
    void previousPage() {
        if(service.getPage() != 1){
            service.setPage(service.getPage()-1);
        }
        printTreasureByCost(cost);
    }

    @Override
    void printChoices() {
        System.out.println("===========================================");
        System.out.println("0 - Выход в главное меню\n" +
                "1 - Следующая страница\n" +
                "2 - Предыдущая страница");
    }
}
