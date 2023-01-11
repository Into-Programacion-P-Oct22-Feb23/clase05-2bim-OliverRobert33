/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        int[] arreglo1;

        System.out.println("Ingrese cuantos elementos nescecita en el arreglo: ");
        int op = entrada.nextInt();
        arreglo1 = new int[op];

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese elementos para llenar el arreglo: ");
            arreglo1[i] = entrada.nextInt();
        }

        System.out.printf("La suma del areglo es: %d}n",
                    misterio(arreglo1, op));
        

    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
