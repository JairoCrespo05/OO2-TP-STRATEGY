package org.example.ej1;

public class Cliente {

    private String nombre;
    private CarritoDeCompras carrito;
    private String ubicacion;
    private EnvioProducto envioProducto;


    public Cliente(String nombre, CarritoDeCompras carrito, String ubicacion, EnvioProducto envioProducto) {
        this.nombre = nombre;
        this.carrito = carrito;
        this.ubicacion = ubicacion;
        this.envioProducto = envioProducto;
    }

    public void hacerPedido(){
        this.envioProducto.enviarPedido(this.carrito, this.ubicacion);
    }

}
