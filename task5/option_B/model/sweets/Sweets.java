/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.sweets;

import java.util.Objects;

public abstract class Sweets {

    String name;
    Type type;
    int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return Objects.equals(name, sweets.name) &&
                type == sweets.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(" - ").append(type.getTitle())
                .append(" стоимость ").append(price);
        return result.toString();
    }
}
