/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.present;

class BirthdayPresent extends Present{

    BirthdayPresent(){
        super();
        name = "Birthday present";
        setPackaging("Small Box");
        addSweets("Milka");
        addSweets("Nutella");
        addSweets("Snickers");
    }
}
