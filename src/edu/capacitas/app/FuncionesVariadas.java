package edu.capacitas.app;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Stefan on 25/11/2016.
 */
public abstract class FuncionesVariadas {


    public static char LeeCaracter(){
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        return c;
    }

    public static void clearConsole() throws IOException {
        System.out.println("************************************");
    }

    public static String pedirEntrada() {
        String entrada = null;

        Scanner reader;
        reader = new Scanner(System.in);
        entrada = reader.next();
        return entrada;
    }

    public static int pedirNumeroPositivo() {
        String numero;
        boolean ok;
        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();
        if(!isNumeric(numero) ){
            ok=false;
            return -1;
        }
        else{
            return Integer.parseInt(numero);
        }
    }

    public static Float pedirFlotante() {
        String numero;
        boolean ok;
        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();
        if(!isNumeric(numero) ){
            ok=false;
            return Float.parseFloat("0");
        }
        else{
            return Float.parseFloat(numero);
        }
    }

    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    public static char pedirSexo() {
        return LeeCaracter();
    }
}

