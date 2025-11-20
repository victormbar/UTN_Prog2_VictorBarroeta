
package Animales;

public class Gato extends Animal{

    @Override
    public void describirAnimal() {
        System.out.println("Soy un Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println("MIAUUU");
    }
    
}