/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private PresentsShop presentsShop;
    private boolean isNotExit;

    public Menu(PresentsShop presentsShop) {
        this.presentsShop = presentsShop;
        isNotExit = true;
    }

    public void run(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (isNotExit){
                printMenu();
                String choice = reader.readLine();
                switch (choice){
                    case "0":
                        isNotExit = false;
                        break;

                    case "1":
                        System.out.println("Введите название подарка");
                        presentsShop.printAllPresents();
                        String name = reader.readLine();
                        presentsShop.newPresent(name);
                        break;

                    case "2":
                        System.out.println("Введите название сладости");
                        presentsShop.printAllSweets();
                        name = reader.readLine();
                        presentsShop.addSweets(name);
                        break;

                    case "3":
                        System.out.println("Введите название сладости");
                        presentsShop.printAllSweets();
                        name = reader.readLine();
                        presentsShop.deleteSweets(name);
                        break;

                    case "4":
                        System.out.println("Введите название упаковки");
                        presentsShop.printAllPackaging();
                        name = reader.readLine();
                        presentsShop.setPackaging(name);
                        break;

                    case "5":
                        presentsShop.createPresent();
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isNumeric(String string) {
        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }

    private void printMenu(){
        System.out.println("0 - Выход");
        System.out.println("1 - Новый подарок");
        System.out.println("2 - Добавить сладость");
        System.out.println("3 - Убрать сладость");
        System.out.println("4 - Выбрать упаковку");
        System.out.println("5 - Создать подарок");
    }


}
