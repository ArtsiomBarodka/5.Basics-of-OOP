/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.present;

import basics_of_OOP.Task5.option_B.model.packaging.Packaging;
import basics_of_OOP.Task5.option_B.model.packaging.PackagingFactory;
import basics_of_OOP.Task5.option_B.model.sweets.Sweets;
import basics_of_OOP.Task5.option_B.model.sweets.SweetsFactory;
import java.util.HashSet;

public abstract class Present {

    String name;
    private HashSet<Sweets> sweetsSet;
    private Packaging packaging;
    private SweetsFactory sweetsFactory;
    private PackagingFactory packagingFactory;

    Present() {
        sweetsSet = new HashSet<>();
        sweetsFactory = new SweetsFactory();
        packagingFactory = new PackagingFactory();
    }

    public Present(SweetsFactory sweetsFactory, PackagingFactory packagingFactory) {
        sweetsSet = new HashSet<>();
        this.sweetsFactory = sweetsFactory;
        this.packagingFactory = packagingFactory;
    }

    void addSweets(String name){
        Sweets sweets = sweetsFactory.getSweets(name);
        if(sweets != null){
            sweetsSet.add(sweets);
        }
    }

    void deleteSweets(String name){
        Sweets sweets = sweetsFactory.getSweets(name);
        sweetsSet.remove(sweets);
    }

    HashSet<Sweets> getSweetsSet() {
        return sweetsSet;
    }

    public void setPackaging(String name){
        Packaging packaging = packagingFactory.getPackaging(name);
        if(packaging != null){
            this.packaging = packaging;
        }
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public int getPrice(){
        int price = packaging.getPrice();
        for (Sweets s:sweetsSet) {
            price = price + s.getPrice();
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean hasSweets(String name){
        boolean result = false;
        for (Sweets s:sweetsSet) {
            if(s.getName().equalsIgnoreCase(name)){
                result = true;
            }
        }
        return result;
    }

    int getFreeSpace(){
        if(packaging!=null){
            return packaging.getCapacity() - sweetsSet.size();
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append("\n")
                .append("======================================\n")
                .append("Конфеты: \n");
        for (Sweets s:sweetsSet) {
            result.append(s).append("\n");
        }
        result.append("======================================\n")
                .append("Упаковка: \n").append(packaging).append("\n")
                .append("======================================\n")
                .append("Итого цена: ").append(getPrice());
        return result.toString();
    }
}
