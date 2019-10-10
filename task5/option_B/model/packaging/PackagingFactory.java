/*
 * 5.Basics of OOP
 * Task 5 Option B
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task5.option_B.model.packaging;

public class PackagingFactory {

    public Packaging getPackaging(String name){
        Packaging packaging = null;
        if(name.equalsIgnoreCase("Big Box")){
            packaging = new BigBox();
        } else if(name.equalsIgnoreCase("Medium Box")){
            packaging = new MediumBox();
        } else if(name.equalsIgnoreCase("Small Box")){
            packaging = new SmallBox();
        }
        return packaging;
    }
}
