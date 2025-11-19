
package TPs_JAVA_TP4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TP #4 -  POO");
        
        Empleado e1 = new Empleado(1, "Victor Barroeta", "Developer", 2000.0);
        Empleado e2 = new Empleado("Carla Salinas", "Scrum Master");
        Empleado e3 = new Empleado("Andres Andrade", "QA");
        Empleado e4 = new Empleado();
        
        System.out.println("Ingresa los datos de un empleado:");
        e4.setId(20);
        e4.setNombre(scanner.nextLine());
        e4.setPuesto(scanner.nextLine());
        e4.setSalario(scanner.nextDouble());
        
        e1.actualizarSalario(0.10); //Se aplica un 10% de aumento
        e2.actualizarSalario(500);

        System.out.println("Empleados: ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println("Total de empleados: "+ Empleado.getTotalEmpleados());
    }

}