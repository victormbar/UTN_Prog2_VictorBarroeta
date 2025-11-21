
package TPS_JAVA_TP8.E_Commerce;


public class Main {

    public static void main(String[] args) {
        // Creamos dos clientes
        Cliente c1 = new Cliente("Cliente 1");
        Cliente c2 = new Cliente("Cliente 2");
        
        // Creamos un pedido para cada cliente
        Pedido pedido = new Pedido("Pendiente", c1);
        Pedido pedido2 = new Pedido("Pendiente", c2);
       
        // Creamos 3 productos
        Producto p1 = new Producto("Play", 10000000);
        Producto p2 = new Producto("Microondas", 500000);
        Producto p3 = new Producto("Computadora", 750000);
        
        // Agregamos 2 productos al pedido del cliente 1
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p3);
        
        // Notificamos el estado en proceso del pedido del cliente 1
        pedido.notificarEstado("EN_PROCESO");
        
        // Calculamos el total del pedido del cliente 1
        double total = pedido.calcularTotal();
        
        // Creamos un nuevo pago con pay pal
        PagoConPayPal pago = new PagoConPayPal();
        
        // Procesamos el pago del cliente 1
        pago.procesarPago(total);
        
        // Notificamos el estado del pedido pagado
        pedido.notificarEstado("PAGADO");
       
        // Agregamos un producto al pedido del cliente 2
        pedido2.agregarProducto(p2);
        // Notificamos su estado en proceso
        pedido2.notificarEstado("EN_PROCESO");
        
        // Calculamos el total del pedido del cliente 2
        double total2 = pedido2.calcularTotal();
        
        // Creamos un pago con tarjeta
        PagoConTarjeta pago2 = new PagoConTarjeta();
        
        // Procesamos el pago con el monto del pedido del cliente 2
        pago2.procesarPago(total2);
        
        // Notificamos al cliente 2 su estado de pedido pagado
        pedido2.notificarEstado("PAGADO");    
    }
    
}
