package edu.capacitas.test;

import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Regalo;
import edu.capacitas.test.helper.ClienteHelper;
import edu.capacitas.test.helper.RegaloHelper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Stefan on 25/11/2016.
 */
public class MainTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println("***********************************************");
        System.out.println("*  TEST Aplicacion - Preparando 2do parcial   *");
        System.out.println("***********************************************");


        System.out.println("** Test de Clientes");
        ClienteHelper.crearyListarClientes();

        List<Regalo> listaRegalo = new ArrayList<>();
        listaRegalo.add(RegaloHelper.obtenerRegalo("Descripcion 4",new Float("150")));   //añadir elemento
        listaRegalo.add(RegaloHelper.obtenerRegalo("Descripcion 5",new Float("250.5")));   //añadir elemento
        listaRegalo.add(RegaloHelper.obtenerRegalo("Descripcion 6",new Float("700.75")));   //añadir elemento
        Calendar fechaHoraNacimiento = Calendar.getInstance();
        fechaHoraNacimiento.set(1982,Calendar.MAY,29,15,20);


/*
        System.out.println("** Test de Regalos");
        RecursoHelper.crearRecurso();
        RecursoHelper.modificarRecurso();
        RecursoHelper.listarRecurso();*/
    }
}