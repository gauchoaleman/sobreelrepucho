package edu.capacitas.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Stefan on 25/11/2016.
 */
public class Cliente {
    private String nombre;
    private Calendar fechaHoraNacimiento;
    private Sexo sexo;
    private List<Regalo> listaRegalos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaHoraNacimiento() {
        return fechaHoraNacimiento;
    }

    public void setFechaHoraNacimiento(Calendar fechaHoraNacimiento) {
        this.fechaHoraNacimiento = fechaHoraNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<Regalo> getListaRegalos() {
        return listaRegalos;
    }

    public void setListaRegalos(List<Regalo> listaRegalos) {
        this.listaRegalos = listaRegalos;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return "Cliente{" +
                " nombre='" + nombre+ '\'' +
                ", sexo=" + sexo +

                ", Regalos=" + listaRegalos +
                '}';
    }

}
