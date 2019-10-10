/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A;

import basics_of_OOP.Task5.option_A.controller.FlowerShop;
import basics_of_OOP.Task5.option_A.controller.Menu;


public class FlowerApp {

    private static final String NAME = "Цветочный магазин";

    private FlowerShop flowerShop = new FlowerShop();
    private Menu menu = new Menu(flowerShop);

    public void play(){
        System.out.printf("%s\n",NAME);
        menu.run();
    }

}
