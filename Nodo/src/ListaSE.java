/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SANDOVAL
 */
public class ListaSE {

    public Nodo primerNodo;
    public Nodo ultimoNodo;

    public ListaSE() {
        primerNodo = ultimoNodo = null;
    }

    public void insertarAlFrente(Polinomio est) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new Nodo(est);
        } else {
            primerNodo = new Nodo(est, primerNodo);
        }
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public void insertarAlFinal(Polinomio est) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new Nodo(est);
        } else {
            ultimoNodo = ultimoNodo.siguiente = new Nodo(est);
        }

    }

}
