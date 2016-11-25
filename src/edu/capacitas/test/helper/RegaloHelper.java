package edu.capacitas.test.helper;

import edu.capacitas.domain.Regalo;

/**
 * Created by Stefan on 25/11/2016.
 */
public class RegaloHelper {
    public static void crearRegalo() {
        System.out.println("Test crear Regalo");
        Regalo regalo = new Regalo();
        regalo.setDescripcion("Descripcion1");

        regalo.setPrecio(new Float("37.5"));
        System.out.println(regalo);

    }

    public static Regalo obtenerRegalo(String descripcion,Float precio) {
        System.out.println("Test obtener Regalo");
        Regalo regalo = new Regalo();
        regalo.setDescripcion(descripcion);

        regalo.setPrecio(precio);
        return regalo;

    }
}
