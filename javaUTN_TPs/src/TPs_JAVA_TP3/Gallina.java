
package TPs_JAVA_TP3;

public class Gallina {
 // --- Atributos ---
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // --- Constructores ---

    //Constructor vacío.

    public Gallina() {
    }

    //Constructor sobrecargado.
  
    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0; // Las gallinas nacen con edad 0
        this.huevosPuestos = 0; // Y 0 huevos puestos
    }

    // --- Métodos Requeridos ---

    //Simula que la gallina pone un huevo, incrementando el contador.
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("¡Gallina " + this.idGallina + " ha puesto un huevo!");
    }

    
      //Simula el paso de un año para la gallina.
     
    public void envejecer() {
        this.edad++;
        System.out.println("Gallina " + this.idGallina + " ahora tiene " + this.edad + " años.");
    }

    
     //Muestra el estado actual de la gallina.
     
    public void mostrarEstado() {
        System.out.println("Estado Gallina ID: " + this.idGallina);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Huevos Puestos: " + this.huevosPuestos);

    }

    // --- Getters y Setters ---

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
       
}
