package edu.capacitas.domain;

/**
 * Created by Stefan on 25/11/2016.
 */
public class Regalo {
    public String descripcion;
    public Float precio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {

        return "Regalo{" +

                "descripcion='" + descripcion+ '\'' +
                ", precio=" + precio +
                '}';
    }

}
