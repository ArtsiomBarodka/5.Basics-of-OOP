/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4;

import basics_of_OOP.Task4.controller.Menu;
import basics_of_OOP.Task4.model.Service;

public class DragonApp {

    private static final int PAGE_SIZE = 5;
    private static final String NAME = "Дракон и его сокровища";

    private Service service = new Service(PAGE_SIZE);
    private Menu menu = new Menu(service);

    public void play(){
        System.out.printf("%s\n",NAME);
        menu.run();
    }
}
