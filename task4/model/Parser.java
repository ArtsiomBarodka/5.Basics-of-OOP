/*
 * 5.Basics of OOP
 * Task 4
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task4.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Parser  {

    Parser(){
    }

    ArrayList<Treasure> parse(){
        ArrayList<Treasure> treasures = new ArrayList<>(100);
        try(BufferedReader reader = new BufferedReader(new FileReader("treasure.txt"))) {
            String line;
            String[] s;
            Treasure treasure;
            while((line=reader.readLine())!=null){
                s = line.split(",");
                treasure = new Treasure();
                int id = Integer.parseInt(s[0].replaceFirst("[a-zA-Z]*=",""));
                String name = s[1].replaceFirst("[a-zA-Z]*=","");
                int cost = Integer.parseInt(s[2].replaceFirst("[a-zA-Z]*=",""));
                treasure.setId(id);
                treasure.setName(name);
                treasure.setCost(cost);
                treasures.add(treasure);
            }
        } catch (IOException ex){
            ex.getMessage();
        }
        return treasures;
    }
}
