
package TPs_JAVA_TP3;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Constructor 
    public Estudiante(String nombre, String apellido,String curso,double calificacion){
           this.nombre = nombre;
           this.apellido = apellido;
           this.curso = curso;
           this.calificacion = calificacion;          
    }
     
   // Metodos 
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion: " + this.calificacion);
    }
    
    public void subirCalificacion(double puntos){
        this.calificacion = this.calificacion + puntos;
    }
    
    public void bajarCalificacion(double puntos){
        this.calificacion = this.calificacion - puntos;
    }  
}
