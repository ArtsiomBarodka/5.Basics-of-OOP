/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.packaging;

import java.util.Objects;

public abstract class Packaging {

    String name;
    int price;
    int capacity;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packaging packaging = (Packaging) o;
        return capacity == packaging.capacity &&
                Objects.equals(name, packaging.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(" вместимостью ").append(capacity)
                .append(" стоимостью ").append(price);
        return result.toString();
    }
}
