package edu.capacitas.app;

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

            app.listarClientes();
            Menues.mostrarMenuPpal();
            //operacion = LeeCaracter();
            operacionString = FuncionesVariadas.pedirEntrada();
            clearConsole();
            switch (operacionString) {
                case "C":
                    app.agregarCliente();
                    app.getListadoClientes();
                    break;
                case "L":
                    //gestionarRecursos();
                    //app. Clientes();
                    app.getListadoClientes();
                    break;
                case "I":
                    //gestionarAlquileres();
                    break;
                case "S":
                default:
                    break;
            }
        } while (!("S".equals(operacionString)));
    }


}