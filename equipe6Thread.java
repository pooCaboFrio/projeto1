/*
    * 25/10/13
    * Leone Luiz C. Ferreira
    *  Alessandra Nonato Marques
    *   Kelly Cristina de Souza Barreto
    *   Gabriel Assumpção Bruno
 */
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leone
 */
public class Threads extends Thread{
    public void run(){
        setPriority(Thread.MIN_PRIORITY);
        int c;
       while(true){ 
           System.out.println(Thread.currentThread().getName());
           try {
            sleep(100);
        } catch (InterruptedException e) {
            
        }
       }
           
        
       
   
    
}}
