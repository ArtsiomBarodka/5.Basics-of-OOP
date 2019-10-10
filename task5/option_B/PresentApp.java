/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B;

import basics_of_OOP.Task5.option_B.controller.Menu;
import basics_of_OOP.Task5.option_B.controller.PresentsShop;

public class PresentApp {

    private static final String NAME = "Магазин подарков";

    private PresentsShop presentsShop = new PresentsShop();
    private Menu menu = new Menu(presentsShop);

    public void play(){
        System.out.printf("%s\n",NAME);
        menu.run();
    }
}
