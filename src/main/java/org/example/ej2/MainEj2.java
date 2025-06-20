package org.example.ej2;

import java.time.LocalDate;

public class MainEj2 {
    public static void main(String[] args) {

        var formatoLargo = new FechaFormatoLargo();
        var persona = new Persona("Juan", LocalDate.parse("2025-06-20"), formatoLargo);

        var formatoCorto = new FechaFormatoCorto();
        var persona2 = new Persona("Miguel", LocalDate.parse("2025-06-20"), formatoCorto);


        System.out.println(persona.fechaNacimiento());
        System.out.println(persona2.fechaNacimiento());


    }
}
