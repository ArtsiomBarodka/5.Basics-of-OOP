/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.controller;

import basics_of_OOP.Task5.option_B.model.Present.Service;

public class PresentsShop {

    private Service service;

    public PresentsShop() {
        service = new Service();
    }

    void newPresent(String name){
        service.newPresent(name);
    }

    void createPresent(){
        if(service.getPresent() != null){
            if(service.getPackaging()!= null){
                if(service.hasSweets()){
                    System.out.println(service.getPresent());
                } else {
                    System.out.println("Выберите сладость!");
                }
            } else {
                System.out.println("Выберите упаковку!");
            }
        } else {
            System.out.println("Выберите подарок!");
        }
    }

    void addSweets(String name){
        if(service.getFreeSpace() > 0){
            if(service.addSweets(name)){
                System.out.printf("Сладость %s добавлена\n" +
                                "Осталось %d места для сладости \n",
                                name,service.getFreeSpace());
            } else {
                System.out.println("Такой сладости нет");
            }
        } else {
            System.out.println("В упаковке больше нет места!");
        }
    }

    void deleteSweets(String name){
        if(service.deleteSweets(name)){
            System.out.printf("Сладость %s убрана\n" +
                            "Осталось %d места для сладости \n",
                            name,service.getFreeSpace());
        } else {
            System.out.println("Такой сладости нет");
        }
    }

    public void setPackaging(String name){
        if(service.setPackaging(name)){
            System.out.printf("Упаковка %s выбрана\n",name);
        } else {
            System.out.println("Такой упаковки нет");
        }
    }

    public void printAllSweets(){
        System.out.println("1. Alenka");
        System.out.println("2. Chupa Chups");
        System.out.println("3. Milka");
        System.out.println("4. Nutella");
        System.out.println("5. Raffaello");
        System.out.println("6. Snickers");
    }

    public void printAllPackaging(){
        System.out.println("1. Big Box");
        System.out.println("2. Medium Box");
        System.out.println("3. Small Box");
    }
    public void printAllPresents(){
        System.out.println("1. Holiday Present");
        System.out.println("2. Birthday Present");
        System.out.println("3. Christmas Present");
        System.out.println("4. New Present");
    }


}
