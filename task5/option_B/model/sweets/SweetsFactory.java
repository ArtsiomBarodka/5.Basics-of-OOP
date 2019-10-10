/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.sweets;

public class SweetsFactory {
    public Sweets getSweets(String name){
        Sweets sweets = null;
        if(name.equalsIgnoreCase("Alenka")){
            sweets = new Alenka();
        } else if(name.equalsIgnoreCase("Chupa Chups")){
            sweets = new ChupaChups();
        } else if(name.equalsIgnoreCase("Milka")){
            sweets = new Milka();
        } else if(name.equalsIgnoreCase("Nutella")){
            sweets = new Nutella();
        } else if(name.equalsIgnoreCase("Raffaello")){
            sweets = new Raffaello();
        } else if(name.equalsIgnoreCase("Snickers")){
            sweets = new Snickers();
        }
        return sweets;
    }
}
