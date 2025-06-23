package org.example.ej1.fake;

import org.example.ej1.EnvioProducto;
import org.example.ej1.WebService;

public class FakeServicioWeb implements WebService {
    private String url /* = "http://distancia.ar?orgen=capital&destino=xxx"*/;

    static final double DISTANCIA = 55.5;

    public FakeServicioWeb(String url){
        this.url = url;
    }

    @Override
    public double calcularPrecioXDistancia(String destino){
        System.out.println("Accediendo al servicio Web :" + this.url);

        double costo = 5 * DISTANCIA; //esto simularia el calcular de $5 x la distancia

        System.out.println("El costo por la distancia hasta " +destino+ " es: " + costo);

        return  costo;
    }
}
