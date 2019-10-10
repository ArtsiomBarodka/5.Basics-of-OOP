/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.properties;

public enum TypeOfPackaging {
    FILM("Пленка",50),
    ORGANZA("Органза",75),
    NETTING("Сетка",100),
    CRAFT_PAPER("Крафт-бумага",110),
    RIBBON("Ленточка",20);

    private String title;
    private int price;

    TypeOfPackaging(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return title;
    }
}
