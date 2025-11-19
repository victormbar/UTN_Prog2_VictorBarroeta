/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPs_JAVA_TP5;

/**
 *
 * @author vcman
 */
import java.util.Date;

public class ejercicio4 {

    public class TarjetaDeCredito{
        private int numero;
        private Date fechaVencimiento;
        private Cliente cliente;
        private Banco banco;

        public TarjetaDeCredito(int numero, Date fechaVencimiento, Cliente cliente, Banco banco) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.cliente = cliente;
            this.banco = banco;
        }
    }
    
    public class Cliente{
        private String nombre;
        private int dni;
        private TarjetaDeCredito tarjetaDeCredito;

        public Cliente(String nombre, int dni, TarjetaDeCredito tarjetaDeCredito) {
            this.nombre = nombre;
            this.dni = dni;
            this.tarjetaDeCredito = tarjetaDeCredito;
        }
    }
    
    public class Banco{
        private String nombre, cuit;

        public Banco(String nombre, String cuit) {
            this.nombre = nombre;
            this.cuit = cuit;
        }   
    }
}