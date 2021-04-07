/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SANDOVAL
 */
public class Polinomio {

    private int coeficiente;
    private int exponente;

    public Polinomio() {
        this.coeficiente = 0;
        this.exponente = 0;

    }

    public Polinomio(int co, int ex) {
        setPolinomio(co, ex);

    }

    public void setPolinomio(int coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public int getExponente() {
        return this.exponente;
    }

    public void setExponente(int ex) {
        this.exponente = ex;
    }

    public int getCoeficiente() {
        return this.coeficiente;
    }

}
