package es.sauces.u5a4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Cristian Mateos Vega   DAW1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cristian.matveg
 */
public class ej02 {

    private static final Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, n = 0, posicion, acumulador, contador, buscado = 0, i;
        LinkedList<Integer> lista = new LinkedList<>();

        do {
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla.");
            System.out.println("3. Solicitar un entero por teclado e insertarlo en la primera posición.");
            System.out.println("4. Solicitar un entero por teclado e insertarlo en la última posición.");
            System.out.println("5. Mostrar el contenido en orden inverso.");
            System.out.println("6. Mostrar los elementos primero y último.");
            System.out.println("7. Eliminar los elementos primero y último.");
            System.out.println("8. Solicitar un entero por teclado y elimine la primera aparición del número introducido.");
            System.out.println("9. Solicitar un entero por teclado y eliminar la última aparición del número introducido.");
            System.out.println("10. Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("11. Invertir el orden de los elementos y mostrarlos por pantalla.");
            System.out.println("12. Mostrar por pantalla cuántas veces aparece cada número.");
            System.out.println("13. Eliminar todos los elementos.");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Introduzca opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion >= 0 && opcion <= 13) {
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
                            lista.addFirst(leerNumero(n));
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 4 -> {
                        if (!lista.isEmpty()) {
                            lista.addLast(leerNumero(n));
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 5 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Orden inverso de la lista: ");
                            System.out.println(lista.reversed());
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 6 -> {
                        if (!lista.isEmpty()) {
                           System.out.println("Primero: "+lista.getFirst());
                           System.out.println("Ultimo "+lista.getLast());
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 7 -> {
                        if (!lista.isEmpty()) {
                            lista.pollFirst();
                            lista.pollLast();
                            System.out.println("Primero y ultimo eliminados");
                            System.out.println(lista);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 8 -> {
                        if (!lista.isEmpty()) {
                            Integer num=leerNumero(buscado);
                            if (lista.contains(num)) {
                                lista.removeFirstOccurrence(num);
                            } else {
                                System.out.println("Numero NO encontrado");
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 9 -> {
                        if (!lista.isEmpty()) {
                            Integer num=leerNumero(buscado);
                            if (lista.contains(num)) {
                                lista.removeLastOccurrence(num);
                            } else {
                                System.out.println("Numero NO encontrado");
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 10 -> {
                        if (!lista.isEmpty()) {
                            lista.sort(null);
                            System.out.println("Lista ordenada: ");
                            System.out.println(lista);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 11 -> {
                        if (!lista.isEmpty()) {
                            lista.sort(Collections.reverseOrder());
                            System.out.println("Lista ordenada inversamente: ");
                            System.out.println(lista);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 12 -> {
                        if (!lista.isEmpty()) {
                            for(i=0;i<=10;i++){
                                System.out.println("el numero de elementos "+i+" es: "+Collections.frequency(lista, i));
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 13 -> {
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
