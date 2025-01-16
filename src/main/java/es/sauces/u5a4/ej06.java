package es.sauces.u5a4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Cristian Mateos Vega   DAW1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cristian.matveg
 */
public class ej06 {

    private static final Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, posicion, acumulador, contador, i;
        String codigo=null,nombre=null,buscar=null;
        TreeMap<String,String> lista = new TreeMap<>();

        do {
            System.out.println("1. Solicitar código y nombre de color e insertarlo en el mapa.");
            System.out.println("2. Mostrar el contenido por pantalla.");
            System.out.println("3. Mostrar el primero y el último códigos.");
            System.out.println("4. Mostrar la primera pareja clave/valor.");
            System.out.println("5. Mostrar todas los colores con sus correspondientes códigos.");
            System.out.println("6. Eliminar todos los elementos.");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Introduzca opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion >= 0 && opcion <= 6) {
                switch (opcion) {
                    case 1 -> {
                        lista.put(leerCadena(codigo), leerCadena(nombre));
                        System.out.println("");
                    }
                    case 2 -> {
                        if (!lista.isEmpty()) {
                            System.out.println(lista);
                            System.out.println("");
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                    }
                    case 3 -> {
                        if (!lista.isEmpty()) {
                           System.out.println("Primero: "+lista.firstKey());
                           System.out.println("Ultimo "+lista.lastKey());
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 4 -> {
                        if (!lista.isEmpty()) {
                           System.out.println(lista.firstEntry());
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 5 -> {
                        if (!lista.isEmpty()) {
                            System.out.println(lista.entrySet());
                            System.out.println("");
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 6 -> {
                        if (!lista.isEmpty()) {
                            lista.clear();
                            System.out.print("Todos los elementos han sido eliminados.");
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    default -> {
                        System.out.print("Adios");
                    }
                }
            } else {
                System.out.println("Seleccione una opcion valida");
            }
        } while (opcion != 0);
    }

    public static String leerCadena(String s) {
        System.out.print("Introduce cadena: ");
        s = teclado.nextLine();
        return s;
    }
}
