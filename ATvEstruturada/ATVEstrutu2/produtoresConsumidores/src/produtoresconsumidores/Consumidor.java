/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoresconsumidores;

public class Consumidor extends Thread { 
    
  private Produto cubbyhole; 
  private int number; 
  
  public Consumidor(Produto c, int number) 
    { cubbyhole = c; this.number = number; } 
  public void run() { 
    int value = 0; 
    for (int i = 0; i < number; i++) { 
      value = cubbyhole.get(number); 
    } 
  } 
}
