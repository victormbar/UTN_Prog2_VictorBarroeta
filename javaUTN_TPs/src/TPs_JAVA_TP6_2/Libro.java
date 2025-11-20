
package TPs_JAVA_TP6_2;

import TPs_JAVA_TP6_2.Autor;


public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor  autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void mostrarInfo(){
        System.out.println("Libro {isbn: "+isbn+
                            "\ntitulo: "+titulo+
                            "\n anio de Publicacion: "+anioPublicacion+
                            "\n "+autor.mostrarInfo()+
                            "}");
    }
}
