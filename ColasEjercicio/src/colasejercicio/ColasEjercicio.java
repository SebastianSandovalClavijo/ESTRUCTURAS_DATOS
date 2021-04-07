/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasejercicio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author SANDOVAL
 */
public class ColasEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        Queue<Integer> colas = new LinkedList<Integer>();
        Queue<Integer> colas2 = new LinkedList<Integer>();
        int opc = 0;
        int opc1;

        int datos, datos2;//orden del polinomio

        //Cual es el monomio que tiene mayor orden
        do {
            System.out.println();
            System.out.println("COLA 1");

            System.out.println();
            System.out.println("Ingrese el dato");
            datos = teclado.nextInt();

            colas.offer(datos);

            System.out.println("Agregar mas datos a la lista");
            System.out.println("1.SI");
            System.out.println("2.NO");

            int revicion = teclado.nextInt();
            if (revicion == 1) {
                opc = 0;
            } else {
                opc = 1;
            }

        } while (opc == 0);
        do {
            System.out.println();
            System.out.println("COLA 2");
            System.out.println();
            System.out.println("Ingrese el dato");
            datos2 = teclado.nextInt();

            colas2.offer(datos2);

            System.out.println("Agregar mas datos a la lista");
            System.out.println("1.SI");
            System.out.println("2.NO");

            int revicion = teclado.nextInt();
            if (revicion == 1) {
                opc = 0;
            } else {
                opc = 1;
            }

        } while (opc == 0);
        int tamaño = colas.size();
        int tamaño2 = colas2.size();
        System.out.println();
        System.out.println("=== COLA 1 ===");
        System.out.println();
        while (colas.peek() != null) {

            System.out.println(colas.poll());

        }
        System.out.println();
        System.out.println("=== COLA 2 ===");
        System.out.println();
        while (colas2.peek() != null) {

            System.out.println(colas2.poll());

        }
        System.out.println();
        System.out.println("=== INFORMACION DE COLAS ===");
        System.out.println();
        System.out.println("El tamaño de la cola 1 es de " + tamaño);

        System.out.println("El tamaño de la cola 2 es de " + tamaño2);

        if (tamaño == tamaño2) {
            System.out.println("Tiene el mismo tamaño ambas colas");
        } else {
            System.out.println("No tiene el mismo tamaño las colas");
        }
    }
}
