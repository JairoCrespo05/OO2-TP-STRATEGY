package org.example.ej1;


import java.awt.font.NumericShaper;

public class ServicioWeb {
    private String url /* = "http://distancia.ar?orgen=capital&destino=xxx"*/;

    public ServicioWeb(String url){
        this.url = url;
    }

    public double calcularPrecioXDistancia(String destino){
        System.out.println("Accediendo al servicio Web :" + this.url);

        double costo = 5 * Math.round(Math.random() * 100.0) / 100.0; //esto simularia el calcular de $5 x la distancia

        System.out.println("El costo por la distancia hasta " +destino+ " es: " + costo);

        return  costo;
    }

}
