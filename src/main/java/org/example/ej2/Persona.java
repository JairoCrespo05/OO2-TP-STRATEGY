package org.example.ej2;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;
    private FormatoFecha formato;


    public Persona(String nombre, LocalDate fechaNacimiento, FormatoFecha formato) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.formato = formato;
    }

    public String fechaNacimiento(){

        String fechaFormateada = this.formato.formatearFecha(this.fechaNacimiento);
        return fechaFormateada;
    }
}
