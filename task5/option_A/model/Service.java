/*
 * 5.Basics of OOP
 * Task 5 Option A
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_A.model;

public class Service {

    private Bouquet.Builder bouquet;

    public Service() {

    }

    public void newBouquet(){
        this.bouquet = Bouquet.newBuilder();
    }

    public void addFlower(Flower f){
        bouquet.withFlower(f);
    }

    public boolean deleteFlower(Flower f){
        boolean result = false;
        if(bouquet.build().hasFlower(f)){
            bouquet.withoutFlower(f);
            result = true;
        }
        return result;
    }

    public void addPackaging(Packaging p){
        bouquet.withPackaging(p);
    }

    public boolean deletePackaging(Packaging p){
        boolean result = false;
        if(bouquet.build().hasPackaging(p)){
            bouquet.withoutPackaging(p);
            result = true;
        }
        return result;
    }

    public boolean changeFlowerCount(Flower f , int count){
        boolean result = false;
        if(bouquet.build().hasFlower(f)){
            bouquet.withoutFlower(f);
            f.setCount(count);
            bouquet.withFlower(f);
            result = true;
        }
        return result;
    }

    public boolean changePackagingCount(Packaging p , int count){
        boolean result = false;
        if(bouquet.build().hasPackaging(p)){
            bouquet.withoutPackaging(p);
            p.setCount(count);
            bouquet.withPackaging(p);
            result = true;
        }
        return result;
    }

    public Bouquet createBouquet(){
        return bouquet.build();
    }


}
