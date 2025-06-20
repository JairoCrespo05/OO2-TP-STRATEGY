package org.example.ej1;

public class Producto {

    private String nombre;
    private double precio;
    private double peso;

    public Producto(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    public String miNombreEs(){
        return this.nombre;
    }

    public double miPrecioEs(){
        return this.precio;
    }

    public double miPesoEs(){
        return this.peso;
    }
}
