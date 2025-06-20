package org.example.ej1;

public class ColectivoSur implements EnvioProducto{

    static final String CAPITAL_FEDERAL = "Capital Federal";
    static final String BUENOS_AIRES = "Buenos Aires";

    public ColectivoSur(){

    }

    @Override
    public void enviarPedido(CarritoDeCompras carritoDeCompras, String destino) {

        double precioTotal = carritoDeCompras.precioTotal();
        double pesoTotal = carritoDeCompras.pesoTotal();

        if(destino.equals(CAPITAL_FEDERAL)){
            precioTotal += 1000;
        } else if (destino.equals(BUENOS_AIRES)) {
            precioTotal += 1500;

        } else{
            precioTotal += 3000;
        }

        if (pesoTotal > 5 && pesoTotal < 30){
            precioTotal += 500;
        }
        if (pesoTotal > 30){
            precioTotal += 2000;
        }

        System.out.println("Colectivo Sur, el monto total es de :" + precioTotal);

    }
}
