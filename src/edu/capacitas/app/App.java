package edu.capacitas.app;

import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Regalo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stefan on 25/11/2016.
 */
public class App {

    private List<Cliente> listadoClientes;


    public App() {
        this.listadoClientes = new ArrayList<>();
    }

    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void listarClientes(){
        System.out.println("Imprimiendo listado clientes");
        if (listadoClientes.size() > 0) {
            for(int i=0; i<listadoClientes.size(); i++) System.out.println(listadoClientes.get(i));
        }
        else {
            System.out.println("NO hay clientes para listar");
        }

    }

    public Cliente agregarCliente(){

        int id;
        Cliente cliente = new Cliente();
        List<Regalo>  listadoRegalos = new ArrayList<>();


        //FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        System.out.println("Arranca agregar Cliente");

        System.out.println("Id: ");
        id = FuncionesVariadas.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = FuncionesVariadas.pedirNumeroPositivo();
        }
        System.out.println("Nombre:");
        cliente.setNombre(FuncionesVariadas.pedirEntrada());
        System.out.println("Sexo:");
        String Sexo = FuncionesVariadas.pedirEntrada();

        if( Sexo == "M") {
            cliente.setSexo(edu.capacitas.domain.Sexo.MASCULINO);
        }
        else {
            cliente.setSexo(edu.capacitas.domain.Sexo.FEMENINO);
        }

        System.out.println("Cuántos regalos?");
        int ctdRegalos = FuncionesVariadas.pedirNumeroPositivo();

        for( int i=0;i<ctdRegalos;i++)
            listadoRegalos.add(leerRegalo());

        cliente.setListaRegalos(listadoRegalos);
        listadoClientes.add(cliente);
        return cliente;
    }

    public void buscarDeAfuera(){
        buscarCliente(listadoClientes);
    }
    private void buscarCliente(List<Cliente>listadoClientes){
        System.out.println("Ingrese criterio de búsqueda: ");
        String aguja = FuncionesVariadas.pedirEntrada();
        System.out.println("Buscando " + aguja +"...");
        for(int i=0; i<listadoClientes.size(); i++){
            if( buscarEnCliente(listadoClientes.get(i),aguja) ) {
                System.out.println(listadoClientes.get(i));
            }
        }
    }

    public boolean buscarEnCliente(Cliente cliente,String aguja) {
        boolean found;
        //System.out.println("buscar en clientes:"+cliente);
        found = cliente.getNombre().contains(aguja);
        found = found || cliente.getNombre().contains(aguja);
        return found;
    }

    public Regalo leerRegalo(){

        int id;
        Regalo regalo = new Regalo();
        //FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        System.out.println("Arranca leer regalo");

        System.out.println("Id: ");
        id = FuncionesVariadas.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = FuncionesVariadas.pedirNumeroPositivo();
        }
        System.out.println("Descripcion:");
        regalo.setDescripcion(FuncionesVariadas.pedirEntrada());
        System.out.println("Precio: ");
        regalo.setPrecio(FuncionesVariadas.pedirFlotante());

        return regalo;
    }

    /*public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(List<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }
    */
}
