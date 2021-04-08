package pilas_ejercicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Pilas_Ejercicio {

//Escribir un programa que, haciendo uso de una pila, procese cada uno de los caracteres de una
//expresión que viene dada en una linea. La finalidad es verificar el equilibrio de paréntesis, llaves y
//corchetes. Por ejemplo, la siguiente expresión tiene un número de paréntesis equilibrado
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("=== Ingrese un arreglo, con parentes para evaluar su equilibro ===");
        System.out.println();
        String entrada = teclado.nextLine();
        Stack<Character> pilas = new <Character>Stack();
        String eliminar = "";
        ArrayList<Character> agregar = new <Character>ArrayList();
        int i = 0;

        for (int a = 0; a < entrada.length(); a++) {
            if (entrada.charAt(a) == '{' || entrada.charAt(a) == '(' || entrada.charAt(a) == '[' || entrada.charAt(a) == ']' || entrada.charAt(a) == ')' || entrada.charAt(a) == '}') {
                agregar.add(entrada.charAt(a));
            } else {
                eliminar += entrada.charAt(a);
            }
        }
        System.out.println();
        System.out.println("=== INFORMACION ARREGLO ===");
        System.out.println();

        System.out.println("El arreglo es " + agregar);

        int tamaño = agregar.size();

        while (i < tamaño) {
            if (agregar.get(i) == '(') {

                pilas.push('(');

            } else {
                if (agregar.get(i) == '{') {

                    pilas.push('{');

                } else {
                    if (agregar.get(i) == '[') {

                        pilas.push('[');

                    } else {
                        if (pilas.isEmpty()) {
                            break;
                        } else {
                            pilas.pop();
                        }
                    }
                }
            }
            i++;
        }

        if (pilas.empty()
                && i == tamaño) {
            System.out.println();
            System.out.println("Existe un equilibrio de paréntesis");
            System.out.println();

        } else {
            System.out.println();
            System.out.println("No existe un equilibrio de paréntesis");
            System.out.println();
        }
    }

}
