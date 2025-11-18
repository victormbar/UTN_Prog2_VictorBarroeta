package TPs_JAVA_TP3;

import java.util.Scanner;
import java.time.LocalDate;
/**
 * Clase principal que ejecuta todos los ejercicios del TP3 secuencialmente.
 */
public class TP3Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // El Main llama a la lógica de cada ejercicio
        probarEjercicio1(scanner);
        presionarEnter(scanner);
        
        probarEjercicio2(scanner);
        presionarEnter(scanner);

        probarEjercicio3(scanner);
        presionarEnter(scanner);

        probarEjercicio4(scanner);
        presionarEnter(scanner);

        probarEjercicio5(scanner);
        
        scanner.close();
    }

    // --- Lógica de Prueba para cada Ejercicio (Secuencial) ---

    private static void probarEjercicio1(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("=== 1. PRUEBA DE REGISTRO DE ESTUDIANTES ===");
        System.out.println("=============================================");
        
        // 1. Instanciar estudiante con datos del usuario
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine().trim();
        
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine().trim();
        
        System.out.print("Ingrese curso: ");
        String curso = scanner.nextLine().trim();
        
        double calificacion = leerDouble(scanner, "Ingrese calificación inicial: ");

        Estudiante est1 = new Estudiante(nombre, apellido, curso, calificacion);

        // 2. Mostrar info
        est1.mostrarInfo();

        // 3. Modificar calificaciones
        double puntosSubir = leerDouble(scanner, "Puntos a SUBIR la nota: ");
        est1.subirCalificacion(puntosSubir);

        double puntosBajar = leerDouble(scanner, "Puntos a BAJAR la nota: ");
        est1.bajarCalificacion(puntosBajar);

        // 4. Mostrar estado final
        System.out.println("\n--- Estado Final Estudiante ---");
        est1.mostrarInfo();
    }

    private static void probarEjercicio2(Scanner scanner) {
        System.out.println("\n=====================================");
        System.out.println("=== 2. PRUEBA DE REGISTRO DE MASCOTAS ===");
        System.out.println("=====================================");
        
        // 1. Crear mascota
        System.out.print("Nombre de la mascota: ");
        String nombre = scanner.nextLine().trim();
        
        System.out.print("Especie (ej: Perro): ");
        String especie = scanner.nextLine().trim();
        
        int edad = leerEntero(scanner, "Edad inicial: ");

        Mascota mascota = new Mascota(nombre, especie, edad);
        mascota.mostrarInfo();

        // 2. Simular paso del tiempo
        System.out.println("Simulando un año...");
        mascota.cumplirAnios();
        
        System.out.println("Estado final:");
        mascota.mostrarInfo();
    }

    private static void probarEjercicio3(Scanner scanner) {
        System.out.println("\n===============================================");
        System.out.println("=== 3. PRUEBA DE ENCAPSULAMIENTO (CLASE LIBRO) ===");
        System.out.println("===============================================");
        
        // 1. Crear libro
        System.out.print("Título del libro: ");
        String titulo = scanner.nextLine().trim();
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine().trim();
        
        int anio = leerEntero(scanner, "Año de publicación (válido, ej: 1995): ");

        Libro libro1 = new Libro(titulo, autor, anio);
        libro1.mostrarInfo();

        // 2. Intentar modificar con año inválido (VALIDACIÓN)
        System.out.println("\n--- Prueba de Setter con Validación ---");
        int anioInvalido = -500;
        System.out.println("Intentando establecer año inválido: " + anioInvalido);
        libro1.setAnioPublicacion(anioInvalido); // El setter mostrará el error
        
        // 3. Modificación correcta
        int anioValido = leerEntero(scanner, "Ahora ingrese un año válido (ej: 2020): ");
        libro1.setAnioPublicacion(anioValido);

        // 4. Estado final
        System.out.println("\n--- Información Final del Libro ---");
        libro1.mostrarInfo();
    }

    private static void probarEjercicio4(Scanner scanner) {
        System.out.println("\n=======================================");
        System.out.println("=== 4. PRUEBA DE GESTIÓN DE GALLINAS ===");
        System.out.println("=======================================");
        
        // 1. Crear dos gallinas
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);

        System.out.println("Creando Gallina #1 y Gallina #2 (ID 1 y 2)");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // 2. Simular acciones
        System.out.println("\n--- Simulando Acciones ---");
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo(); 
        g2.envejecer();
        g2.envejecer(); 
        g2.ponerHuevo(); 

        // 3. Mostrar estados finales
        System.out.println("\n--- Reporte Final de la Granja ---");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }

    private static void probarEjercicio5(Scanner scanner) {
        System.out.println("\n=========================================");
        System.out.println("=== 5. PRUEBA DE SIMULACIÓN NAVE ESPACIAL ===");
        System.out.println("=========================================");
        
        // 1. Crear nave
        System.out.print("Nombre de la nave: ");
        String nombre = scanner.nextLine().trim();
        
        double inicial = leerDouble(scanner, "Combustible inicial (Max 100): ");

        NaveEspacial nave = new NaveEspacial(nombre, inicial);
        nave.despegar();

        // 2. Intentar avanzar (Prueba de FALLO)
        System.out.println("\n--- Prueba de Avance (Fallo) ---");
        double dist1 = leerDouble(scanner, "Distancia larga a viajar (ej: 800): ");
        nave.avanzar(dist1); 
        nave.mostrarEstado();

        // 3. Recargar (Prueba de VALIDACIÓN DE MÁXIMO)
        System.out.println("\n--- Prueba de Recarga (Llenado) ---");
        double recarga = leerDouble(scanner, "Cantidad a recargar (ej: 70): ");
        nave.recargarCombustible(recarga);

        // 4. Intentar avanzar de nuevo (Prueba de ÉXITO)
        System.out.println("\n--- Prueba de Avance (Éxito) ---");
        double dist2 = leerDouble(scanner, "Distancia corta a viajar (ej: 300): ");
        nave.avanzar(dist2); 

        // 5. Final
        System.out.println("\n--- Fin de la Simulación ---");
        nave.mostrarEstado();
    }


    // --- Métodos de Ayuda para lectura robusta (Reutilizados del AppMenu anterior) ---

    /**
     * Lee un entero de la consola de forma robusta.
     */
    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }
    }

    /**
     * Lee un double de la consola de forma robusta.
     */
    private static double leerDouble(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido (ej: 10.5).");
            }
        }
    }

    /**
     * Pausa la ejecución.
     */
    private static void presionarEnter(Scanner scanner) {
        System.out.println("\nPresione [Enter] para continuar...");
        scanner.nextLine();
    }
}

