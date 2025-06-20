package org.example.ej3;

public class CalculadoraOtro implements CalculadoraProducto{
    static final double IMPUESTOS = 0.15;
    static final double DESCUENTOS = 0.05;
    private boolean envioGratis;

    public CalculadoraOtro(){

    }

    @Override
    public double calcularPrecio(double precio) {
        double descuentos = 0;
        if (precio > 50) {
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
