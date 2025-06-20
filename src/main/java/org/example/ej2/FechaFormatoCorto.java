package org.example.ej2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaFormatoCorto implements FormatoFecha{


    @Override
    public String formatearFecha(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return fecha.format(formato);
    }
}
