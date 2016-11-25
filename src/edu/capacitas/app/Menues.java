package edu.capacitas.app;

/**
 * Created by Stefan on 25/11/2016.
 */
public abstract class Menues {
    public static void mostrarMenuPpal()
    {
        System.out.println("***********************************************");
        System.out.println("*  Alquileres Capacitas                       *");
        System.out.println("***********************************************");
        System.out.println("*- Agregar  [C]liente                         *");
        System.out.println("*- Listar   c[L]ientes                        *");
        System.out.println("*- Borrar   cl[I]ente                         *");
        System.out.println("*- Buscar   cli[E]ente                        *");
        System.out.println("*- [S]alir                                    *");
        System.out.println("***********************************************");
    }

    public static void mostrarMenuClientes()
    {
        System.out.println("***********************************************");
        System.out.println("*  Alquileres Capacitas                       *");
        System.out.println("*****Clientes**********************************");
        System.out.println("*- [N]uevo                                    *");
        System.out.println("*- [B]uscar                                   *");
        System.out.println("*- [V]olver                                   *");
        System.out.println("***********************************************");
    }

}