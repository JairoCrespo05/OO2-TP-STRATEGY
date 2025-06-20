package org.example.ej3;

public class CalculadoraAlimento implements CalculadoraProducto{

    static final double IMPUESTOS = 0.05;
    static final double DESCUENTOS = 0.15;
    private boolean envioGratis;

    public CalculadoraAlimento(){

    }

    @Override
    public double calcularPrecio(double precio) {
        double precioTotal = 0;
        double descuentos = 0;

        if (precio > 100) {
            descuentos = DESCUENTOS;
        }
        if (precio > 200) {
            envioGratis = true;
        }
        double total = precio * (1 + IMPUESTOS) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }

}
