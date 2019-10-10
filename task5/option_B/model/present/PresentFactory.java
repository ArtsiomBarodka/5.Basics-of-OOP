/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.present;

class PresentFactory {
    Present getPresent(String name){
        Present present = null;
        if(name.equalsIgnoreCase("Holiday present")){
            present = new HolidayPresent();
        } else if(name.equalsIgnoreCase("Birthday present")){
            present = new BirthdayPresent();
        } else if(name.equalsIgnoreCase("Christmas present")){
            present = new ChristmasPresent();
        } else {
            present = new PersonalPresent(name);
        }
        return present;
    }
}
