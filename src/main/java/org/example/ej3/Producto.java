package org.example.ej3;

public class Producto {
    private CalculadoraProducto calculadora;
    private double precio;

    public Producto(CalculadoraProducto calculadora, double precio) {
        this.calculadora = calculadora;
        this.precio = precio;
    }

    public double precioFinal() {
        return this.calculadora.calcularPrecio(precio);
    }

}

