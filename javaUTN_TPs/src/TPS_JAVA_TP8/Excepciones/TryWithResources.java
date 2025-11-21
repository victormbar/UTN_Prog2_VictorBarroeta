
package TPS_JAVA_TP8.Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\vcman\\OneDrive\\Documentos\\UTN Programacion\\2do Cuatrimestre\\Programación II\\TP Prog II\\UTN_Prog2_VictorBarroeta\\javaUTN_TPs\\src\\TPS_JAVA_TP8\\Excepciones");
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            System.out.println(br.readLine());  
        } catch(IOException ex) {
            System.out.println("Error de E/S: "+ ex.getMessage());
        } 
    }
    
}
