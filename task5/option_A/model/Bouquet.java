/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.model;


import java.util.HashSet;

public class Bouquet {

    private HashSet<Flower> flowers;
    private HashSet<Packaging> packagingSet;

    private Bouquet() {
        flowers = new HashSet<>();
        packagingSet = new HashSet<>();
    }

    private void addFlower(Flower f){
        flowers.add(f);
    }

    private void deleteFlower(Flower f){
        flowers.remove(f);
    }

    private void addPackaging(Packaging p){
        packagingSet.add(p);
    }

    private void deletePackaging(Packaging p){
        packagingSet.remove(p);
    }

    private int getPrice(){
        int cost = 0;
        for (Flower f : flowers) {
            cost = cost + f.getAllPrice();
        }
        for (Packaging p : packagingSet) {
            cost = cost + p.getAllPrice();
        }
        return cost;
    }

    boolean hasFlower(Flower f){
        boolean result = false;
        for (Flower fl:flowers) {
            if(fl.equals(f)){
                result = true;
            }
        }
        return result;
    }

    boolean hasPackaging(Packaging p){
        boolean result = false;
        for (Packaging pk:packagingSet) {
            if(p.equals(pk)){
                result = true;
            }
        }
        return result;
    }

    static Builder newBuilder() {
        return new Bouquet().new Builder();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Букет \n")
                .append("======================================\n")
                .append("Цветы: \n");
        for (Flower f:flowers) {
            result.append(f).append("\n");
        }
        result.append("Упаковка: \n");
        for (Packaging p: packagingSet) {
            result.append(p).append("\n");
        }
        result.append("======================================\n")
                .append("Итого цена: ").append(getPrice());
        return result.toString();
    }

    class Builder{

        private Bouquet newBouquet;

        Builder() {
            newBouquet = new Bouquet();
        }

        Builder withFlower(Flower flower){
            newBouquet.addFlower(flower);
            return this;
        }

        Builder withoutFlower(Flower flower){
            newBouquet.deleteFlower(flower);
            return this;
        }

        Builder withoutPackaging(Packaging packaging){
            newBouquet.deletePackaging(packaging);
            return this;
        }

        Builder withPackaging(Packaging packaging){
            newBouquet.addPackaging(packaging);
            return this;
        }

        Bouquet build(){
            return newBouquet;
        }
    }


}
