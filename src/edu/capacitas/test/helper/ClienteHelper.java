package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Regalo;
import edu.capacitas.domain.Sexo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Stefan on 25/11/2016.
 */
public class ClienteHelper {

    public static void crearyListarClientes() {
        List<Regalo> listaRegalo = new ArrayList<>();
        System.out.println("Test crearyListarClientes()");


        listaRegalo.add(RegaloHelper.obtenerRegalo("Descripcion 1",new Float("50")));   //añadir elemento
        listaRegalo.add(RegaloHelper.obtenerRegalo("Descripcion 2",new Float("150.5")));   //añadir elemento
        listaRegalo.add(RegaloHelper.obtenerRegalo("Descripcion 3",new Float("500.75")));   //añadir elemento


        Cliente cliente = new Cliente();

        cliente.setNombre("Stefan");
        cliente.setSexo(Sexo.MASCULINO);
        Calendar fechaHoraNacimiento = Calendar.getInstance();
        fechaHoraNacimiento.set(1978,Calendar.MAY,29,15,20);

        cliente.setFechaHoraNacimiento(fechaHoraNacimiento);
        cliente.setListaRegalos(listaRegalo);

        //System.out.println("CrearCliente()");
        System.out.println(cliente);
    }

    public static Cliente obtenerCliente(List<Regalo> listaRegalo,String nombre,Calendar fechaHoraNacimiento,Sexo sexo) {

        System.out.println("Test obtenerCliente()");


        Cliente cliente = new Cliente();

        cliente.setNombre(nombre);
        cliente.setSexo(sexo);
        cliente.setFechaHoraNacimiento(fechaHoraNacimiento);
        cliente.setListaRegalos(listaRegalo);

        return cliente;
    }

}
