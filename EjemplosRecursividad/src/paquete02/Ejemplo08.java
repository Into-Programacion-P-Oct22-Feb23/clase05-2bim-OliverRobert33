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
        int [] arreglo1;
        System.out.println("Ingrese cuantops elementos nescecita en el arreglo: ");
        int i = entrada.nextInt();
        arreglo1 = new int[i];
        
        for (int f = 0; f < arreglo1.length; f++) {
            int num;
            System.out.println("Ingrese elementos para llenar el arreglo: ");
            num = entrada.nextInt();
            arreglo1[f] = num;
        
        
        for (int j = 0; j < 10; j++) {
            System.out.printf("La suma del areglo es: %d", arreglo1[f], arreglo1[i]);
        }
        
        }
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
