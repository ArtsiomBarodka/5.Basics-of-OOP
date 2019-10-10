/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.present;

class ChristmasPresent extends Present{

    ChristmasPresent(){
        super();
        name = "Christmas present";
        setPackaging("Medium Box");
        addSweets("Nutella");
        addSweets("Alenka");
        addSweets("Milka");
        addSweets("Raffaello");
    }
}
