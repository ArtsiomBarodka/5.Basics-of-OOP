/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.sweets;

public enum Type {

    CHOCOLATE("Шоколадка"),
    COCOA_SPREAD("Шоколадная паста"),
    CHOCOLATE_BAR("шоколадный батончик"),
    FIZZY_DRINKS("Газированный напиток"),
    CONFECTION("Конфета");

    private String title;
    private int price;

    Type(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }


    }
