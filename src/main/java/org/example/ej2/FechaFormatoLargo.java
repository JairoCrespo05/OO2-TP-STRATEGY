package org.example.ej2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaFormatoLargo implements FormatoFecha{

    public FechaFormatoLargo(){

    }

    @Override
    public String formatearFecha(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");

        return fecha.format(formato);
    }
}
