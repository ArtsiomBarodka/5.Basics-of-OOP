/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.properties;

public enum Color {
    RED("Красная"),
    YELLOW("Желтая"),
    BLUE("Голубая"),
    BROWN("Коричневая"),
    WHITE("Белая"),
    BLACK("Черная"),
    ORANGE("Ораньжевая"),
    PINK("Розовая"),
    GRAY("Серая");

    private String title;

    Color(String title){
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
