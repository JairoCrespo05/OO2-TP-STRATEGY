package org.example.ej1;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    private List<Producto> productos;

    public CarritoDeCompras(){
        this.productos = new ArrayList<>();
    }

    public void agregarAlCarrito(Producto p){
        this.productos.add(p);
    }

    public double precioTotal(){
        double precioTotal = 0;
        for (Producto producto : this.productos){
            precioTotal += producto.miPrecioEs();
        }

        return precioTotal;
    }

    public double pesoTotal(){
        double pesoTotal = 0;
        for (Producto producto : this.productos){
            pesoTotal += producto.miPesoEs();
        }
        return pesoTotal;
    }

}
