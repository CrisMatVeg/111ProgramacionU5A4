/*
 * Cristian Mateos Vega   DAW1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.sauces.u5a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cristian.matveg
 */
public class ej01 {

    private static final Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, n = 0, posicion, acumulador, contador, buscado = 0,i;
        ArrayList<Integer> lista = new ArrayList<>();

        do {
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla.");
            System.out.println("3. Solicitar una posición por teclado y mostrar por pantalla el entero que ocupa dicha posición.");
            System.out.println("4. Mostrar el contenido por pantalla en orden inverso.");
            System.out.println("5. Mostrar por pantalla el número de elementos que tiene el ArrayList.");
            System.out.println("6. Mostrar por pantalla la media de los números contenidos.");
            System.out.println("7. Solicitar una posición por teclado y cambiar el entero que ocupe dicha posición por 0.");
            System.out.println("8. Solicitar un entero por teclado y nos diga si se encuentra o no en el ArrayList.");
            System.out.println("9. Solicitar un entero por teclado y nos muestra la posición en la que está.");
            System.out.println("10. Solicitar un entero por teclado y lo elimina del ArrayList.");
            System.out.println("11. Solicitar una posición por teclado e insertar el número 0 en dicha posición.");
            System.out.println("12. Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("13. Ordenar los elementos en orden inverso y mostrarlos por pantalla.");
            System.out.println("14. Mostrar el mayor y el menor de los elementos.");
            System.out.println("15. Rotar los elementos una posición a la derecha.");
            System.out.println("16. Intercambiar el primer elemento con el último");
            System.out.println("17. Eliminar todos los elementos.");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Introduzca opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion >= 0 && opcion <= 17) {
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
                            System.out.println("Introduzca la posicion en la que quiere buscar algo:");
                            posicion = teclado.nextInt();
                            if (posicion >= 0 && posicion <= lista.size()) {
                                System.out.println("En esa posición se encuentra en siguiente numero: " + lista.get(posicion));
                            } else {
                                System.out.println("No se encuentra esa posición en la lista, quiza sea superior al numero maximo de posiciones");
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 4 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Orden inverso de la lista: ");
                            System.out.println(lista.reversed());
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 5 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Numero de elementos: " + lista.size());
                            System.out.println("");
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 6 -> {
                        if (!lista.isEmpty()) {
                            acumulador=0;
                            contador=0;
                            for(i=0;i<=lista.size()-1;i++){
                                acumulador+=lista.get(i);
                                contador++;
                            }
                            System.out.println("Media: "+(float)acumulador/contador);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 7 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Introduzca la posicion:");
                            posicion = teclado.nextInt();
                            if (posicion >= 0 && posicion <= lista.size()-1) {
                                lista.set(posicion, 0);
                            } else {
                                System.out.println("No se encuentra esa posición en la lista, quiza sea superior al numero maximo de posiciones");
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 8 -> {
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
                    case 9 -> {
                        if (!lista.isEmpty()) {
                            Integer num=leerNumero(buscado);
                            if (lista.contains(num)) {
                               System.out.print("Encontrado en la posicion: "+Collections.binarySearch(lista,num));
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
                            Integer num=leerNumero(buscado);
                            lista.remove(num);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 11 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Introduzca la posicion:");
                            posicion = teclado.nextInt();
                            if (posicion >= 0 && posicion <= lista.size()) {
                                lista.add(posicion, n);
                            } else {
                                System.out.println("No se encuentra esa posición en la lista, quiza sea superior al numero maximo de posiciones");
                            }
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 12 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Lista ordenada: ");
                            lista.sort(null);
                            System.out.println(lista);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 13 -> {
                        if (!lista.isEmpty()) {
                            lista.sort(Collections.reverseOrder());
                            System.out.println("Lista ordenada inversamente: ");
                            System.out.println(lista);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 14 -> {
                        if (!lista.isEmpty()) {
                            System.out.println("Numero Menor: "+Collections.min(lista));
                            System.out.println("Numero Mayor: "+Collections.max(lista));
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 15 -> {
                        if (!lista.isEmpty()) {
                            Collections.rotate(lista, 1);
                            lista.forEach(System.out::println);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 16 -> {
                        if (!lista.isEmpty()) {
                            Integer aux = lista.getFirst();
                            lista.set(0, lista.getLast());
                            lista.set(lista.indexOf(lista.getLast()), aux);
                            System.out.println("El primer elemento y el ultimo se han intercambiado.");
                            System.out.println(lista);
                        } else {
                            System.out.println("Operacion no disponible, la lista está vacia");
                        }
                        System.out.println("");
                    }
                    case 17 -> {
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
