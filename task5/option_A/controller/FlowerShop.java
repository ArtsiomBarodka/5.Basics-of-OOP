/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.controller;

import basics_of_OOP.Task5.option_A.model.*;
import basics_of_OOP.Task5.option_A.properties.Color;
import basics_of_OOP.Task5.option_A.properties.NameOfFlowers;
import basics_of_OOP.Task5.option_A.properties.TypeOfPackaging;

public class FlowerShop {
    
    private Service service;

    public FlowerShop() {
        service = new Service();
    }

    void addFlower(String name, int count){
        Flower f = createFlower(name,count);
        if(f!=null){
            service.addFlower(f);
            System.out.printf("Цветок %s добавлен\n",f);
        } else {
            System.out.println("В каталоге такого цветка нет");
        }
    }

    void deleteFlower(String name){
        Flower f = createFlower(name,1);
        if(f!=null){
            if(service.deleteFlower(f)){
                System.out.printf("Цветок %s убран\n",f.getName());
            } else {
                System.out.println("В букете такого цветка нет");
            }
        } else {
            System.out.println("В каталоге такого цветка нет");
        }
    }

    void changeFlowerCount(String name, int count){
        Flower f = createFlower(name,1);
        if(f!=null){
            if(service.changeFlowerCount(f, count)){
                System.out.printf("Изменено: %s\n",f);
            } else {
                System.out.println("В букете такого цветка нет");
            }
        } else {
            System.out.println("В каталоге такого цветка нет");
        }
    }
    
    private Flower createFlower(String name, int count){
        Flower newFlower = null;
        NameOfFlowers[] names = NameOfFlowers.values();
        for (NameOfFlowers n : names) {
            if(n.getTitle().equalsIgnoreCase(name)){
                newFlower = new Flower(n,count);
            }
        }
        return newFlower;
    }

    void addPackaging(String name, String color, int count){
        Packaging p = createPackaging(name, color, count);
        if(p!=null){
            service.addPackaging(p);
            System.out.printf("Упаковка %s добавлен\n",p);
        } else {
            System.out.println("В каталоге такой упаковки нет");
        }
    }

    void deletePackaging(String name, String color){
        Packaging p = createPackaging(name, color, 1);
        if(p!=null){
            if(service.deletePackaging(p)){
                System.out.printf("Упаковка %s %s убрана\n",p.getColor(),p.getType());
            } else {
                System.out.println("В букете такой упаковки нет");
            }
        } else {
            System.out.println("В каталоге такой упаковки нет");
        }
    }

    void changePackagingCount(String name, String color,int count){
        Packaging p = createPackaging(name, color, 1);
        if(p!=null){
            if(service.changePackagingCount(p, count)){
                System.out.printf("Изменено: %s\n",p);
            } else {
                System.out.println("В букете такой упаковки нет");
            }
        } else {
            System.out.println("В каталоге такой упаковки нет");
        }
    }

    private Packaging createPackaging(String type, String color, int count){
        Packaging newPackaging = null;
        TypeOfPackaging[] types = TypeOfPackaging.values();
        Color[] colors = Color.values();
        for (TypeOfPackaging t:types) {
            if(t.getTitle().equalsIgnoreCase(type)){
                for (Color c:colors) {
                    if(c.getTitle().equalsIgnoreCase(color)){
                        newPackaging = new Packaging(t, c, count);
                    }
                }
            }
        }
        return newPackaging;
    }

    void createBouquet(){
        Bouquet bouquet = service.createBouquet();
        System.out.println(bouquet);
    }

    void newBouquet(){
        service.newBouquet();
    }
    
}
