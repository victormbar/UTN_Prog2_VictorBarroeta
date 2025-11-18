
package TPs_JAVA_TP3;

public class NaveEspacial {
    // --- Atributos ---
    private String nombre;
    private double combustible;
    // Usamos una constante para el límite de combustible
    private static final double MAX_COMBUSTIBLE = 100.0;
    // Definimos una tasa de consumo (ej: 10 unidades de distancia por 1 de combustible)
    private static final double TASA_CONSUMO = 10.0;

    // --- Constructores ---

    // Constructor vacío.

    public NaveEspacial() {
        this.combustible = 0;
    }

    // Constructor sobrecargado.
  
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        // Usamos el método recargarCombustible para la carga inicial,
        // así nos aseguramos de no superar el máximo.
        this.combustible = 0; // Empieza en 0 antes de recargar
        this.recargarCombustible(combustibleInicial);
    }

    // --- Métodos Requeridos ---

    public void despegar() {
        System.out.println("Nave " + this.nombre + ": ¡Iniciando secuencia de despegue!");
    }

    // Intenta avanzar una distancia, validando el combustible.
  
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia / TASA_CONSUMO;

        System.out.println("Intentando avanzar " + distancia + " unidades (requiere " + combustibleNecesario + " de combustible)...");

        if (this.combustible >= combustibleNecesario) {
            this.combustible -= combustibleNecesario;
            System.out.println("¡Avance exitoso! Combustible restante: " + this.combustible);
        } else {
            System.out.println("¡FALLO! Combustible insuficiente. Solo se puede avanzar " + (this.combustible * TASA_CONSUMO) + " unidades.");
        }
    }

    //Recarga combustible, validando no superar el máximo.
 
    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        
        this.combustible += cantidad;
        
        if (this.combustible > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno. Combustible al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            System.out.println(cantidad + " de combustible recargado. Nivel actual: " + this.combustible);
        }
    }

  
    //Muestra el estado actual de la nave.

    public void mostrarEstado() {
        System.out.println("--- Estado Nave: " + this.nombre + " ---");
        System.out.println("Combustible: " + this.combustible + " / " + MAX_COMBUSTIBLE);

    }

    // --- Getters y Setters ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

}
