/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.model;

import basics_of_OOP.Task5.option_A.properties.Color;
import basics_of_OOP.Task5.option_A.properties.TypeOfPackaging;

import java.util.Objects;

public class Packaging {

    private TypeOfPackaging type;
    private Color color;
    private int count;

    public Packaging() {
    }

    public Packaging(TypeOfPackaging type, Color color, int count) {
        this.type = type;
        this.color = color;
        this.count = count;
    }

    public int getAllPrice(){
        return count*type.getPrice();
    }

    public TypeOfPackaging getType() {
        return type;
    }

    public void setType(TypeOfPackaging type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        Packaging packaging = (Packaging) o;
        return type == packaging.type &&
                color == packaging.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(color).append(" ").append(type)
                .append(" ").append(count).append(" шт.")
                .append(" - стоимостью ").append(getAllPrice());
        return result.toString();
    }
}
