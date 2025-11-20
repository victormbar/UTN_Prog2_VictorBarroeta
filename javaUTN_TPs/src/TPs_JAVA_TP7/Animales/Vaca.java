
package Animales;


public class Vaca extends Animal{

    @Override
    public void describirAnimal() {
        System.out.println("Soy una Vaca");
    }

    @Override
    public void hacerSonido() {
        System.out.println("MUUUUUUUUU");
    }
}