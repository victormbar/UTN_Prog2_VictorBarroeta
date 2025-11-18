
package TPs_JAVA_TP3;

public class Libro {
    
   // Atributos 
   private String titulo;
   private String autor;
   private int anioPublicacion;
   
   // Constructores 
   
   public Libro (){
   }
   
   
   public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor= autor;
        this.setAnioPublicacion(anioPublicacion); 
   }
   
   // Metodos 
       public void mostrarInfo(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año: " + this.anioPublicacion);
    }
   // Getters y Setters
       
    public String getTitulo (){
        return titulo;
    }

    public String getAutor() {
     return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
       
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor= autor;  
    }
    
     // Setter con validacion
    
    public void setAnioPublicacion(int anio){
        if (anio > 0 && anio <= 2025){
            this.anioPublicacion = anio;
            System.out.println("Año de publicación actualizado a " + anio);
        } else{
            System.out.println("Error: El año '" + anio + "' no es valido. No se realizó el cambio");
        }       
    }  
}
