/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.model;

import basics_of_OOP.Task4.controller.ReadyState;
import basics_of_OOP.Task4.controller.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service {

    private State state;
    private ArrayList<Treasure> treasures;
    private int pageSize;
    private int page;

    public Service(int pageSize) {
        this.pageSize = pageSize;
        treasures = new Parser().parse();
        page = 1;
        state = new ReadyState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void getTreasureByCost(int cost){
        ArrayList<Treasure> result = new ArrayList<>();
        Collections.sort(treasures, Comparator.comparing(Treasure::getId));
        for (Treasure t:treasures) {
            if(t.getCost() == cost){
                result.add(t);
            }
        }
        print(result);
    }

    public void getAllTreasures(){
        Collections.sort(treasures, Comparator.comparing(Treasure::getId));
        print(treasures);
    }

    public void getTheMostExpensiveTreasure(){
        ArrayList<Treasure> result = new ArrayList<>();
        Collections.sort(treasures,
                Comparator.comparing(Treasure::getCost).reversed().thenComparing(Treasure::getId));
        int i = 0;
        while (treasures.get(0) == treasures.get(i)){
            result.add(treasures.get(i));
            i++;
        }
        print(result);
    }

    private void print(ArrayList<Treasure> result){
        StringBuilder text = new StringBuilder();
        int allPage = countPage(result);
        page = page > allPage? allPage : page;
        int start = (page - 1)*pageSize;
        int end = start + pageSize;
        if(allPage != 0){
            text.append("===========================================\n");
            for (int i = start; i < end; i++) {
                if(result.size() <= i){
                    break;
                }
                text.append(result.get(i).toString()).append("\n");
            }
            text.append("===========================================\n");
            text.append("Страница ").append(page).append(" из ").append(allPage);
        } else {
            text.append("К сожалению пусто!");
        }

        System.out.println(text.toString());
    }

    private int countPage(ArrayList<Treasure> result){
        int objects = result.size();
        int count = objects/pageSize;
        if(objects%pageSize != 0){
            count = count + 1;
        }
        return count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
