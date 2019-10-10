/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneratorOfTreasures {
    private final static String[] NAMES ={"Монеты","Картина","Часы","Смартфон","Телевизор",
                "Алмаз","Золотой слиток","Автомобиль","Перчатка бесконечности","Миллион долларов"};

    public static void generate(){
        StringBuilder treasures = new StringBuilder();
        String name;
        int cost;
        for (int i = 0; i < 100; i++) {
            name = NAMES[new Random().nextInt(10)];
            cost = new Random().nextInt(99)*100+100;
            treasures.append("id=").append(i+1).append(",name=")
                        .append(name).append(",cost=").append(cost).append("\n");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("treasure.txt"))){
            writer.write(treasures.toString());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
