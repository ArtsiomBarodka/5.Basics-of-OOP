/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.model;

import basics_of_OOP.Task5.option_A.properties.NameOfFlowers;

import java.util.Objects;

public class Flower {

    private NameOfFlowers name;
    private int count;

    public Flower() {
    }

    public Flower(NameOfFlowers name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getAllPrice(){
        return count*name.getPrice();
    }

    public NameOfFlowers getName() {
        return name;
    }

    public void setName(NameOfFlowers name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return name == flower.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(" ").append(count).append(" шт.")
                .append(" - стоимостью ").append(getAllPrice());
        return result.toString();
    }
}
