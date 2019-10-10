package basics_of_OOP;

import basics_of_OOP.Task1.Directory;
import basics_of_OOP.Task1.TextFile;
import basics_of_OOP.Task2.Payment;
import basics_of_OOP.Task3.Calendar;
import basics_of_OOP.Task4.DragonApp;
import basics_of_OOP.Task5.option_A.FlowerApp;
import basics_of_OOP.Task5.option_B.PresentApp;

public class Main {
    public static void main(String[] args) {
        /*
         * 5.Simple Classes
         * Task 1
         *
         * Создать объект класса Текстовый файл, используя классы Файл,
         * Директория. Методы: создать, переименовать,
         * вывести на консоль содержимое, дополнить, удалить.
         *
         * Artsiom Barodka
         *
         */

        Directory dir = new Directory("C://SomeDir");
        String text = "Hello world!";
        TextFile file = new TextFile(dir,"text.txt",text);
        TextFile file2 = new TextFile(dir,"text2.txt",text);
        if(file.createNewFile()){
            file.print();
            file.addText("oh no");
            file.print();
        }
        System.out.println(dir.getFiles().size());
        System.out.println(file.getName());
        if(file.renameTo("hellow.txt")){
            System.out.println(file.getName());
        }
        file.delete();
        if(!file.exists()){
            System.out.println("Файл удален!");
        }
        file2.print();


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

        Payment payment = new Payment("H&M");
        payment.createPayment();
        payment.printPayment();


        /*
         * 5.Simple Classes
         * Task 3
         *
         * Создать класс Календарь с внутренним классом,
         * с помощью объектов которого можно хранить информацию о
         * выходных и праздничных днях.
         *
         * Artsiom Barodka
         *
         */

        Calendar calendar = new Calendar("Мой");
        calendar.newEvent("День Рождения",5,13,6, 2019,false);
        calendar.newEvent("Новый Год",4,31,12, 2019,false);
        calendar.newEvent("Начало отпуска",10,9,7, 2020,true);
        calendar.printEvents();
        calendar.sortEventsByImportance();
        calendar.printEvents();
        calendar.sortEventsByDate();
        calendar.printEvents();

        /*
         * 5.Simple Classes
         * Task 4
         *
         * Создать консольное приложение, удовлетворяющее следующим требованиям:
         *  • Приложение должно быть объектно-, а не процедурно-ориентированным.
         *  • Каждый класс должен иметь отражающее смысл название и информативный состав.
         *  • Наследование должно применяться только тогда, когда это имеет смысл.
         *  • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
         *  • Классы должны быть грамотно разложены по пакетам.
         *  • Консольное меню должно быть минимальным.
         *  • Для хранения данных можно использовать файлы.
         *
         * Дракон и его сокровища. Создать программу,
         * позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
         * Реализовать возможность просмотра сокровищ,
         * выбора самого дорогого по стоимости сокровища и
         * выбора сокровищ на заданную сумму.
         *
         * Artsiom Barodka
         *
         */

        DragonApp dragonApp = new DragonApp();
        dragonApp.play();


        /*
         * 5.Simple Classes
         * Task 5 Option A
         *
         * Создать консольное приложение, удовлетворяющее следующим требованиям:
         *  • Корректно спроектируйте и реализуйте предметную область задачи.
         *  • Для создания объектов из иерархии классов продумайте
         *  возможность использования порождающих шаблонов проектирования.
         *  • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
         *  • для проверки корректности переданных данных можно применить регулярные выражения.
         *  • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
         *  • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode()
         *
         * Вариант A. Цветочная композиция. Реализовать приложение,
         * позволяющее создавать цветочные композиции
         * (объект, представляющий собой цветочную композицию).
         * Составляющими цветочной композиции являются цветы и упаковка.
         *
         * Artsiom Barodka
         *
         */

        FlowerApp flowerApp = new FlowerApp();
        flowerApp.play();


        /*
         * 5.Simple Classes
         * Task 5 Option B
         *
         * Создать консольное приложение, удовлетворяющее следующим требованиям:
         *  • Корректно спроектируйте и реализуйте предметную область задачи.
         *  • Для создания объектов из иерархии классов продумайте
         *  возможность использования порождающих шаблонов проектирования.
         *  • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
         *  • для проверки корректности переданных данных можно применить регулярные выражения.
         *  • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
         *  • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode()
         *
         * Вариант B. Подарки. Реализовать приложение,
         * позволяющее создавать подарки (объект, представляющий собой подарок).
         * Составляющими целого подарка являются сладости и упаковка.
         *
         * Artsiom Barodka
         *
         */

        PresentApp presentApp = new PresentApp();
        presentApp.play();
    }
}
