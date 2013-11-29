/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoresconsumidores;

import static java.lang.Thread.sleep;

public class Produtor extends Thread { 
  private Produto produto; 
  private int numero; 
  public Produtor(Produto c, int numero) { 
    produto = c; this.numero = numero; 
  } 
  public void run() { 
    for (int i = 0; i < numero; i++) { 
      produto.put(numero, i); 
      try { sleep((int)(Math.random() * 30)); 
      } catch (InterruptedException e) { } 
    } 
  } 
} 
