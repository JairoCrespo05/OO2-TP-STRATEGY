package org.example.ej1;

public class CorreoArgentino implements EnvioProducto{

    static final String CAPITAL_FEDERAL = "Capital Federal";
    private ServicioWeb servicioWeb;

    public CorreoArgentino(ServicioWeb servicioWeb){
        this.servicioWeb = servicioWeb;
    }

    @Override
    public void enviarPedido(CarritoDeCompras carritoDeCompras, String destino) {
        double precioTotal = carritoDeCompras.precioTotal();
        double pesoTotal = carritoDeCompras.pesoTotal();

        if (destino.equals(CAPITAL_FEDERAL)){
            precioTotal += 500;
        }else{
            precioTotal += 800 + servicioWeb.calcularPrecioXDistancia(destino) ;
        }

        System.out.println("Correo Argentino, el monto total es de :" + precioTotal);

    }

}
