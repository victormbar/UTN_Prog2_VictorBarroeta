
package TPs_JAVA_TP3;

public class Mascota{  
    
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    //-----Constructores ----
    
    // constuctor vacío
    public Mascota(){
    }
   
    // Constructor sobrecargado
    public Mascota(String nombre, String especie,int edad){
        this.nombre = nombre;
        this.especie= especie;
        this.edad = edad;          
    }
    
    // mostrar la informacion de mascotads
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " años");
    }
    
    // Simula el cumpleaños de la mascota, incrementando su edad en 1. 
    public void cumplirAnios() {
        this.edad ++; //Incrementa la edad en 1 
        System.out.println("Ahora tu mascota tiene " + this.nombre + " años.");
    }
    
    // Getters y Setters
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
