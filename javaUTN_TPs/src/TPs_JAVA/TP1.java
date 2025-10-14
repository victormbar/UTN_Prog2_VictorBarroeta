/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TPs_JAVA;


import  java.util.Scanner;

public class TP1 {
    
    public static void main(String[] args) {
        
         System.out.println("1--------------------");
         
        System.out.println("Hola, Java!");
        
        System.out.println("2--------------------");
        
        /************************************************/
         //Se declaran variables
        String nombre = "Victor Barroeta";
        int edad = 29;
        double altura = 1.78;
        boolean estudiante = true;
//        
        System.out.println("3--------------------");
        
        // Se imprimen
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Esta persona estudiante? " + estudiante );
        /************************************************/
        System.out.println("4------------------------");
        
        Scanner sc = new Scanner(System.in);
//        
        System.out.println("Ingrese tu nombre: ");
        String name = sc.nextLine();
//        
        System.out.println("Ingrese su edad: ");
        int age = sc.nextInt();
        
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        
        /************************************************/
        System.out.println("5------------------------");
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 /  num2);
        
        /************************************************/
        System.out.println("6------------------------");
        
        System.out.println("Nombre: Juan Perez\n");
        System.out.println("Edad:30 anios \n");
        System.out.println("Direccion:\"Calle Falsa 123\"");
        
           /************************************************/
        System.out.println("7------------------------");
        
        System.out.println("int x = 10 -> Expresion\n");
        System.out.println("Es porque es una variable la cual recibe un valor \n");
        
        System.out.println("x = x + 5 -> Expresion con instruccion");
        System.out.println(" Ya que es una combinacion de una expresion e instruccion pero por otra parte \n genera una instrucion ya que realiza un calculo y por otro lado asignael resultado de \n  una operacion a la expresion  \"x\" cambiando su valor.");
               
        
        System.out.println("System.out.println(x)-> instruccion");
        System.out.println("""
                           - Es una setencia que pide al IDE para que ejecute una accion 
                           """);
        int x = 10;
        x = x + 5; 
        System.out.println(x); 
        
        /************************************************/
        System.out.println("8------------------------");
         
        System.out.println("Ingrese dos números enteros: ");
        double numero1 = sc.nextInt();
        double numero2 = sc.nextInt();
        
        System.out.println("La división de los dos numeros es: " + numero1 / numero2 );
        
        System.out.println("Ingrese dos números enteros: ");
        double number1= sc.nextInt();
        double number2 = sc.nextInt();
        
        System.out.println("La división de los dos numeros es: " + number1 / number2 );
        
       

/************************************************/
        System.out.println("9------------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        
        String nombre1 = scanner.nextLine();
        
        System.out.println("Hola, "+ nombre1);
        
        
             
    }
}
