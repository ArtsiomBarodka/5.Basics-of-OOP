/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.model;


public class Treasure {

    private int id;
    private String name;
    private int cost;

    Treasure() {
    }

    Treasure(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getCost() {
        return cost;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(" стоимостью ").append(cost);
        return result.toString();
    }
}
