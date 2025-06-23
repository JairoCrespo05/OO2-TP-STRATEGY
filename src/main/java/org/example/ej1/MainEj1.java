package org.example.ej1;

public class MainEj1 {
    public static void main(String[] args) {

        var p1 = new Producto("Tablet", 1000, 4);
        var p2 = new Producto("Monitor", 4000, 14);

        var carrito = new CarritoDeCompras();
        carrito.agregarAlCarrito(p1);
        carrito.agregarAlCarrito(p2);

//        var cliente = new Cliente("Jose", carrito, "Buenos Aires",
//                new CorreoArgentino(new ServicioWeb("http://distancia.ar?orgen=capital&destino=xxx")));

        var cliente = new Cliente("Jose", carrito, "Buenos Aires",
                new ColectivoSur());

        System.out.println("precio total: " + cliente.hacerPedido());

    }
}
