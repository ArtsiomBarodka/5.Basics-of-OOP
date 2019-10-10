/*
 * 5.Simple Classes
 * Task 2
 *
 * Создать класс Payment с внутренним классом,
 * с помощью объектов которого можно сформировать покупку из
 * нескольких товаров
 *
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {

    private String name;
    private ArrayList<PaymentItem> items;
    private int cost;

    private class PaymentItem {
        private String itemName;
        private int itemCost;

        PaymentItem(String itemName, int itemCost){
            this.itemName = itemName;
            this.itemCost = itemCost;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public int getItemCost() {
            return itemCost;
        }

        public void setItemCost(int itemCost) {
            this.itemCost = itemCost;
        }

        @Override
        public String toString() {
            return itemName + " стоимостью - " + itemCost;
        }
    }

    public Payment(String name){
        this.name = name;
        items = new ArrayList<>();
        cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void createPayment(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Сколько товаров на покупку? ");
            int countItems = scanner.nextInt();
            int i = 0;
            while (i < countItems){
                System.out.printf("Название товара номер %d - ",i+1);
                String name = scanner.next();
                System.out.printf("Стоимость товара номер %d - ",i+1);
                int cost = scanner.nextInt();
                PaymentItem item = new PaymentItem(name,cost);
                this.cost = this.cost + cost;
                items.add(item);
                i++;
            }
        }
    }

    public void printPayment(){
        if(items.size() > 0){
            System.out.println(this.name);
            for (PaymentItem p:items) {
                System.out.println(p.toString());
            }
            System.out.printf("Общая стоимость товаров - %d",cost);
        }
    }
}
