/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *25out2013
 * Rodolfo, Mateus, Daniel
 */
public class Thread1 extends Thread{
    int i =2;
    public void run(){
        while (i>0){
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
