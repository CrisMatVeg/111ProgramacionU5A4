package es.sauces.u5a4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Cristian Mateos Vega   DAW1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cristian.matveg
 */
public class ej03 {

    private static final Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, n = 0, posicion, acumulador, contador, buscado = 0, i;
        HashSet<Integer> lista = new HashSet<>();

        do {
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla.");
            System.out.println("3. Mostrar el número de elementos.");
            System.out.println("4. Mostrar los elementos primero y último.");
            System.out.println("5. Solicitar un entero por teclado y nos diga si se encuentra o no en el TreeSet.");
            System.out.println("6. Solicitar un entero por teclado y lo borre.");
            System.out.println("7. Eliminar los elementos primero y último.");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Introduzca opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion >= 0 && opcion <= 6) {
                switch (opcion) {
                    case 1 -> {
                        lista.add(leerNumero(n));
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
                            System.out.println("El HashSet tiene "+lista.size()+" elementos");
                            
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 4 -> {
                        if (!lista.isEmpty()) {
                            if (lista.contains(leerNumero(buscado))) {
                                System.out.println("Numero encontrado");
                            } else {
                                System.out.println("Numero NO encontrado");
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 5 -> {
                        if (!lista.isEmpty()) {
                           Integer num=leerNumero(buscado);
                           lista.remove(num);
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

    public static int leerNumero(int n) {
        System.out.print("Introduce un numero: ");
        n = teclado.nextInt();
        while (n < 0 || n > 10) {
            System.out.println("Incorrecto (0-10)");
            System.out.print("Introduce un numero: ");
            n = teclado.nextInt();
        }
        return n;
    }
}
