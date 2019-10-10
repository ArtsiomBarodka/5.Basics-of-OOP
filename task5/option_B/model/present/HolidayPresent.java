/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.present;

class HolidayPresent extends Present {

    HolidayPresent(){
        super();
        name = "Holiday present";
        setPackaging("Small Box");
        addSweets("Chupa Chups");
        addSweets("Alenka");
        addSweets("Raffaello");
    }
}
