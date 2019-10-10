/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.present;

import basics_of_OOP.Task5.option_B.model.packaging.Packaging;

public class Service {

    private PresentFactory factory;
    private Present present;

    public Service(){
        factory = new PresentFactory();
    }

    public Service(PresentFactory factory){
        this.factory = factory;
    }

    public void newPresent(String name){
        present = factory.getPresent(name);
    }

    public Present getPresent(){
        return present;
    }

    public boolean setPackaging(String name){
        boolean result = false;
        present.setPackaging(name);
        if(present.getPackaging().getName().equalsIgnoreCase(name)){
            result = true;
        }
        return result;
    }

    public Packaging getPackaging(){
        return present.getPackaging();
    }

    public boolean addSweets(String name){
        boolean result = false;
        present.addSweets(name);
        if(present.hasSweets(name)){
            result = true;
        }
        return result;
    }

    public boolean deleteSweets(String name){
        boolean result = false;
        if(present.hasSweets(name)){
            present.deleteSweets(name);
            result = true;
        }
        return result;
    }

    public boolean hasSweets(){
        return present.getSweetsSet().size() > 0;
    }

    public int getPrice(){
        return present.getPrice();
    }

    public int getFreeSpace(){
        return present.getFreeSpace();
    }
}
