
package Vehiculos;

public class Vehiculo {
    
    protected String marca, modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: "+ marca + "\nModelo: "+ modelo);
    }
}