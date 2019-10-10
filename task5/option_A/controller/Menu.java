/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private FlowerShop flowerShop;
    private boolean isNotExit;

    public Menu(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
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
                        flowerShop.newBouquet();
                        break;

                    case "2":
                        System.out.println("Введите наименование цветка");
                        String name = reader.readLine();
                        String count;
                        do {
                            System.out.println("Введите количество цветков");
                            count = reader.readLine();
                        } while (!isNumeric(count));
                        flowerShop.addFlower(name,Integer.parseInt(count));
                        break;

                    case "3":
                        System.out.println("Введите наименование цветка");
                        name = reader.readLine();
                        flowerShop.deleteFlower(name);
                        break;

                    case "4":
                        System.out.println("Введите наименование цветка");
                        name = reader.readLine();
                        do {
                            System.out.println("Введите количество цветков");
                            count = reader.readLine();
                        } while (!isNumeric(count));
                        flowerShop.changeFlowerCount(name,Integer.parseInt(count));
                        break;

                    case "5":
                        System.out.println("Введите тип упаковки");
                        String type = reader.readLine();
                        System.out.println("Введите цвет упаковки");
                        String color = reader.readLine();
                        do {
                            System.out.println("Введите количество упаковки");
                            count = reader.readLine();
                        } while (!isNumeric(count));
                        flowerShop.addPackaging(type, color, Integer.parseInt(count));
                        break;

                    case "6":
                        System.out.println("Введите тип упаковки");
                        type = reader.readLine();
                        System.out.println("Введите цвет упаковки");
                        color = reader.readLine();
                        flowerShop.deletePackaging(type, color);
                        break;

                    case "7":
                        System.out.println("Введите тип упаковки");
                        type = reader.readLine();
                        System.out.println("Введите цвет упаковки");
                        color = reader.readLine();
                        do {
                            System.out.println("Введите количество упаковки");
                            count = reader.readLine();
                        } while (!isNumeric(count));
                        flowerShop.changePackagingCount(type, color, Integer.parseInt(count));
                        break;

                    case "8":
                        flowerShop.createBouquet();
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
        System.out.println("1 - Новый букет");
        System.out.println("2 - Добавить цветок");
        System.out.println("3 - Убрать цветок");
        System.out.println("4 - Поменять количество цветков");
        System.out.println("5 - Добавить упаковку");
        System.out.println("6 - Убрать упаковку");
        System.out.println("7 - Поменять количество упаковки");
        System.out.println("8 - Создать букет");
    }
}
