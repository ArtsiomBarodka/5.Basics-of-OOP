/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.properties;

public enum  NameOfFlowers {
    CORNFLOWER("Василёк",100),
    CARNATION("Гвоздика",150),
    GLADIOLUS("Гладиолус",200),
    HYDRANGEA("Гортензия",250),
    LAVENDER("Лаванда",300),
    LILY("Лилия",100),
    PEONY("Пион",350),
    ROSE("Роза",300),
    DAISY("Ромашка",100);

    private String title;
    private int price;

    NameOfFlowers(String title, int price){
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
