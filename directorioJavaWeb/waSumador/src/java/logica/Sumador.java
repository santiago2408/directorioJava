/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author alejo
 */
public class Sumador {

    private int numero1;
    private int numero2;
    private int resultado;
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void sumar(){
        resultado=numero1+numero2;
    }


    
    
    
    

}
