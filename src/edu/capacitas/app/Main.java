package edu.capacitas.app;

import edu.capacitas.domain.Cliente;

import java.io.IOException;

/**
 * Created by Stefan on 25/11/2016.
 */
public class Main {

    //private List<Cliente> listadoClientes;

   /*public Main(List<Cliente> listadoClientes) {
        this.listadoClientes = new ArrayList<>();
    }*/

    public static void main(String[] args) throws IOException {
        App app = new App();
        char operacion;
        String operacionString;

        //FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        do {

            //app.listarClientes();
            Menues.mostrarMenuPpal();
            //operacion = LeeCaracter();
            operacionString = FuncionesVariadas.pedirEntrada();

            switch (operacionString) {
                case "C":
                    app.agregarCliente();
                    //app.listarClientes();
                    break;
                case "L":
                    //gestionarRecursos();
                    //app. Clientes();
                    app.listarClientes();
                    break;
                case "I":
                    //borrarCliente();
                    break;
                case "E":
                    app.buscarDeAfuera();
                    break;
                case "S":
                default:
                    break;
            }
        } while (!("S".equals(operacionString)));
    }


}