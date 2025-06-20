package org.example.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    public void Test01(){
        var p1 = new Producto("Tablet", 1000, 4);
        var p2 = new Producto("Monitor", 4000, 14);

        var carrito = new CarritoDeCompras();
        carrito.agregarAlCarrito(p1);
        carrito.agregarAlCarrito(p2);

        var cliente = new Cliente("Jose", carrito, "Buenos Aires",
                new CorreoArgentino(new ServicioWeb("http://distancia.ar?orgen=capital&destino=xxx")));

        cliente.hacerPedido();
    }


    @Test
    public void Test02(){

        var p1 = new Producto("Tablet", 1000, 4);
        var p2 = new Producto("Monitor", 4000, 14);

        var carrito = new CarritoDeCompras();
        carrito.agregarAlCarrito(p1);
        carrito.agregarAlCarrito(p2);

        var cliente = new Cliente("Jose", carrito, "Buenos Aires",
                new ColectivoSur());

        cliente.hacerPedido();



    }
}