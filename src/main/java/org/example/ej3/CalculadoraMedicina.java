package org.example.ej3;

public class CalculadoraMedicina implements CalculadoraProducto{
    static final double IMPUESTOS = 0;
    static final double DESCUENTOS = 0.1;
    private boolean envioGratis;

    public CalculadoraMedicina(){

    }

    @Override
    public double calcularPrecio(double precio) {
        if (precio > 100) {
            envioGratis = true;
        }
        double total = precio * (1 + IMPUESTOS) * (1 - DESCUENTOS);
        if (envioGratis) {
            total -= 10;
        }

        return total;
    }

}
