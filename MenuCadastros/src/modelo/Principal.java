/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *25out2013
 * Rodolfo, Mateus, Daniel
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t1  = new Thread1();
        Thread2 t2  = new Thread2();
        t1.start();
        t2.start();
    }
}
