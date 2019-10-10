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
package basics_of_OOP.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Calendar {

    private String name;
    private ArrayList<Event> events;

    public Calendar(String name) {
        this.name = name;
        events = new ArrayList<>();
    }

    public class Event {

        private String name;
        private int importance;
        private int day;
        private int month;
        private int year;
        private boolean isDayOff;

        public Event() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getImportance() {
            return importance;
        }

        public void setImportance(int importance) {
            this.importance = importance;
        }

        public boolean isDayOff() {
            return isDayOff;
        }

        public void setDayOff(boolean dayOff) {
            isDayOff = dayOff;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countEvents(){
        return events.size();
    }

    public void newEvent(String name,int importance,int day, int month, int year,boolean dayOff){
        Event event = new Event();
        event.setName(name);
        event.setImportance(importance);
        event.setDay(day);
        event.setMonth(month);
        event.setYear(year);
        event.setDayOff(dayOff);
        events.add(event);
    }

    public void sortEventsByImportance(){
        Collections.sort(events, Comparator.comparing(Event::getImportance).reversed()
                .thenComparing(Event::getYear)
                .thenComparing(Event::getMonth)
                .thenComparing(Event::getDay));
    }

    public void sortEventsByDate(){
        Collections.sort(events, Comparator.comparing(Event::getYear)
                .thenComparing(Event::getMonth)
                .thenComparing(Event::getDay));
    }

    public void printEvents(){
        int i = 1;
        System.out.printf("Календарь событий - %s\n",name);
        System.out.println("===============================================================================");
        for (Event e:events) {
            String date = printDate(e.getDay(),e.getMonth(),e.getYear());
            System.out.printf("Событие номер %d. %16s --- %10s ---",i,e.getName(),date);
            if(e.isDayOff()){
                System.out.print(" выходной день ");
            } else {
                System.out.print(" рабочий день ");
            }
            System.out.printf(" важность %2d\n",e.getImportance());
            i++;
        }
        System.out.println("===============================================================================");
        System.out.printf("Итого событий: %d\n",countEvents());
    }

    public String printDate(int day, int month, int year){
        StringBuilder result = new StringBuilder();
        if(day < 10){
            result.append(0);
        }
        result.append(day).append(".");
        if(month < 10){
            result.append(0);
        }
        result.append(month).append(".");
        result.append(year);
        return result.toString();
    }





}
