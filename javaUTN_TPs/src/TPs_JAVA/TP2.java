/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TPs_JAVA;

import java.util.Scanner;

public class TP2 {
    
    // Variables globales
    // Se declara 'static' para que main pueda verla.
    public static final double DESCUENTO_ESPECIAL = 0.10; // 10%

    public static void main(String[] args) {
//
//        System.out.println("1--------------------");
// // Se desconmenta para correr el programa  
// 
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Programa de anios Bisiestos");
//        System.out.println("Ingrese un anio: ");
//        int year = Integer.parseInt(sc.nextLine());
//
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//
//            System.out.println("El anio " + year + " es bisiesto");
//
//        } else {
//            System.out.println("El anio " + year + " no es bisiesto");
//        }
//        
//        System.out.println("2--------------------");
//  // Se desconmenta para correr el programa  
//       
//        Scanner scan = new Scanner(System.in);
//        
//        //Ingreso de numeros
//
//        System.out.println("Numero mayor de tres numeros");
//        System.out.println("Ingrese el primer numero: ");
//        int num1 = Integer.parseInt(scan.nextLine());
//
//        System.out.println("Ingrese el segundo numero: ");
//        int num2 = Integer.parseInt(scan.nextLine());
//
//        System.out.println("Ingrese el tercer numero: ");
//        int num3 = Integer.parseInt(scan.nextLine());
//        
//        // Se hace un estructura condicional IF para determinar el numero mayor 
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("El mayor es: " + num1);
//
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("El mayor es: " + num2);
//            
//        } else {
//            System.out.println("El mayor es: " + num3);
//        }
//
//        System.out.println("3--------------------");
//
//        
        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Clasificacion de edades segun el usuario:");
//        System.out.println("Ingrese su edad: ");
//        int edad = Integer.parseInt(input.nextLine());
//    
//        if (edad >= 0 && edad < 12) {
//            System.out.println("Eres un/a niño/a");
//        } else if (edad >= 12 && edad <= 17) {
//            System.out.println("Eres Adolescente");
//        } else if (edad >= 18 && edad <= 59) {
//            System.out.println("Eres Adulto/a");
//        } else { System.out.println("Eres Adulto/a mayor");
//        }
//
//        System.out.println("4--------------------");
//
//        System.out.println("Calculadora de Descuento según categoría: ");
//
//        System.out.println("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//
//        System.out.println("Ingrese su categoria (A,B o C) ");
//        String cat = input.nextLine();
//        
//        String catMayus = cat.toUpperCase();
//        
//        double precioDes;
//        
//        switch (catMayus) {
//            case "A":
//                precioDes = 0.10;
//                break;
//            case "B":           
//                precioDes = 0.15;
//                break;
//            case "C":      
//                precioDes = 0.20;
//                break;
//            default:
//                System.out.println("Categoria no valida. No se aplica descuento.");
//                precioDes = 0.0; 
//                break;
//        }
//       
//        System.out.println("- El precio original es: " + precio);
//        System.out.println("- Descuento aplicado es: " + (precioDes * 100) + "%");
//        System.out.println("- El precio total es $" + (precio - (precio * precioDes)));
//
//          System.out.println("5--------------------");
//          
//        // Se desconmenta para correr el programa  
//
//          System.out.println("Suma de Números Pares (while).");
//          
//          int sumaPares = 0;
//          
//          System.out.print("Ingresa un número (0 para terminar):\n");
//          int numero = Integer.parseInt(input.nextLine());
//          
//          while (numero !=0){
//              if (numero % 2 == 0){
//                  sumaPares += numero;
//                 
//              }
//              System.out.println(" Ingresa otro número (0 para terminar): ");
//              numero = Integer.parseInt(input.nextLine());
//          
//          }
//          
//          System.out.println("\n La suma total de los numeros pares es: " + sumaPares);
//          
//         
//        System.out.println("6--------------------");
//
//        System.out.println("Contador de Positivos, Negativos y Ceros (for).");
//        // Inicializamos los contadores
//        int positivos = 0;
//        int negativos = 0;
//        int ceros = 0;
//        
//        System.out.println("Por favor, ingrese 10 números enteros.");
//        
//        //Se usa ciclo FOR para la cant exacta de repeticiones
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Ingrese el número " + i + ": ");
//            int numero2 = Integer.parseInt(input.nextLine());
//
//            // Se realiza un condicional dentro del ciclo para dejar un contador
//           
//            if (numero2 > 0) {
//                positivos++; // '++' es un atajo para 'positivos = positivos + 1'
//            } else if (numero2 < 0) {
//                negativos++;
//            } else {
//                ceros++;
//            }
//        }
//        System.out.println("\nResultados:");
//        System.out.println("Positivos: " + positivos);
//        System.out.println("Negativos: " + negativos);
//        System.out.println("Ceros: " + ceros);
//        
//         System.out.println("7--------------------");
//
//        System.out.println("Validación de Nota entre 0 y 10 (do-while).");
//        
//        int nota; 
//
//        // Se realiza el metodo 'do' asegurando que se ejecute una vez al menos
//        do {
//            System.out.print("Ingrese una nota (0-10): ");
//            nota = Integer.parseInt(input.nextLine());
//
//            // Si la nota es inválida, mostramos un error
//            if (nota < 0 || nota > 10) {
//                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
//            }
//            
//        // 3. El 'while' comprueba la condición DESPUÉS de ejecutar el 'do'.
//        //    El bucle SE REPITE MIENTRAS la nota sea inválida.
//        } while (nota < 0 || nota > 10);
//
//        System.out.println("Nota guardada correctamente: " + nota);
//        input.close();
//        
//       System.out.println("8--------------------");
//
//        System.out.println("Cálculo del Precio Final con impuesto y descuento. (Metodo)");
//        
//        // main() se encarga de pedir los datos
//        System.out.print("Ingrese el precio base del producto: ");
//        double precioBase = Double.parseDouble(input.nextLine());
//
//        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
//        double impuestoPorc = Double.parseDouble(input.nextLine());
//
//        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
//        double descuentoPorc = Double.parseDouble(input.nextLine());
//
//        //Se conviente el porcentaje a decimales (10 -> 0.10) 
//        double impuesto = impuestoPorc / 100.0;
//        double descuento = descuentoPorc / 100.0;
//
//        // Llamamos al método "trabajador"
//        double precioFin = calcularPrecioFinal(precioBase, impuesto, descuento);
//
//        System.out.println("El precio final del producto es: " + precioFin);
////        input.close();
//        
//        System.out.println("9--------------------");
//
//        System.out.println("Composición de funciones para calcular costo de envío y total de compra)");
//        System.out.print("Ingrese el precio del producto: ");
//        double precioProducto = Double.parseDouble(input.nextLine());
//
//        System.out.print("Ingrese el peso del paquete en kg: ");
//        double peso = Double.parseDouble(input.nextLine());
//
//        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
//        String zona = input.nextLine();
//
//        // Se llama al primer método
//        double costoEnvio = calcularCostoEnvio(peso, zona);
//
//        // 2. Se  usa el resultado anterior para llamar al segundo método
//        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
//
//        System.out.println("El costo de envío es: " + costoEnvio);
//        System.out.println("El total a pagar es: " + totalCompra);
//        input.close();
//       
//        System.out.println("10--------------------");
//
//        System.out.println("Actualización de stock a partir de venta y recepción de productos");
//        System.out.print("Ingrese el stock actual del producto: ");
//        int stockActual = Integer.parseInt(input.nextLine());
//
//        System.out.print("Ingrese la cantidad vendida: ");
//        int cantidadVendida = Integer.parseInt(input.nextLine());
//
//        System.out.print("Ingrese la cantidad recibida: ");
//        int cantidadRecibida = Integer.parseInt(input.nextLine());
//
//        // Se llama al método con los 3 valores
//        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
//
//        System.out.println("El nuevo stock del producto es: " + nuevoStock);
//        input.close();
//        
//        System.out.println("11--------------------");
//
//        System.out.println("Cálculo de descuento especial usando variable global.");
//        
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//
//        // Se llama al método
//        calcularDescuentoEspecial(precio);
//        
//        input.close();
//        
//                
//        System.out.println("12--------------------");
//
//        System.out.println("Arrays y Recursividad:");
//        // a. Declarar e inicializar el array
//        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
//
//        System.out.println("Precios originales:");
//        
//        // b. Recorrer y mostrar con un bucle for-each
//        for (double precio : precios) {
//            System.out.println("Precio: $" + precio);
//        }
//
//        // c. Modificar un valor por su índice
//        // El índice 2 es el TERCER elemento
//        precios[2] = 129.99;
//
//        System.out.println("\nPrecios modificados:");
//        // d. Volver a recorrer el array 
//        for (double precio : precios) {
//            System.out.println("Precio: $" + precio);
//        }
        
        System.out.println("13--------------------");

        System.out.println("Impresión recursiva de arrays antes y después de modificar un elemento.");
        // 1. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        // 2. Iniciar la recursión desde el índice 0
        imprimirRecursivo(precios, 0);

        // 3. Modificar el valor (igual que en el ej. 7)
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        // 4. Volver a iniciar la recursión desde el índice 0
        imprimirRecursivo(precios, 0);
    }

    /**
     * 13- Método recursivo que imprime un array.
     * Recibe el array y el índice actual que debe imprimir.
     */
    public static void imprimirRecursivo(double[] array, int indice) {
        
        // CASO BASE:
        // Si el índice es igual al largo, nos pasamos, así que terminamos.
        if (indice >= array.length) {
            return; // Termina la llamada actual
        }

        // CASO RECURSIVO:
        //Imprimeel elemento del índice actual
        System.out.println("Precio: $" + array[indice]);
        
        //Vuelve a llamar al método, pero para el SIGUIENTE índice
        imprimirRecursivo(array, indice + 1);
    }
    

    /**
     * 11 - Calcula y MUESTRA el descuento usando la variable global.
     * Este método es 'void' porque no devuelve nada, solo imprime.
     */
    public static void calcularDescuentoEspecial(double precio) {
        
        // 3. El método usa la variable global DESCUENTO_ESPECIAL
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        
        // 4. 'descuentoAplicado' es una variable local, solo existe aquí
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    /**
     * 10 Calcula el nuevo stock basado en ventas y recepciones.
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        // El método aplica la fórmula y devuelve el resultado
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    
    

    /**
     *9- a. Calcula el costo de envío según peso y zona.
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        // Usamos .equalsIgnoreCase() para aceptar "Nacional" o "nacional"
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            System.out.println("Zona no reconocida, costo de envío 0.");
            return 0.0; // Zona no válida
        }   
    }
    /**
     * 9- b. Calcula el total sumando producto y envío.
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    /**
     * 8. Método que calcula el precio final aplicando impuesto y descuento.
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        //El método solo hace el cálculo y devuelve el resultado
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
        
          
        
    }
    
  
