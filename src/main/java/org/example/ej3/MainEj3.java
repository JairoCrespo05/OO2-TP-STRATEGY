package org.example.ej3;


public class MainEj3 {
    public static void main(String[] args) {

        var producto = new Producto(new CalculadoraLibro(), 200);
        var producto2 = new Producto(new CalculadoraAlimento(), 200);
        var producto3 = new Producto(new CalculadoraMedicina(), 200);
        var producto4 = new Producto(new CalculadoraOtro(), 200);

        System.out.println(producto.precioFinal());
        System.out.println(producto2.precioFinal());
        System.out.println(producto3.precioFinal());
        System.out.println(producto4.precioFinal());

    }
}