/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoresconsumidores;


public class Produto { 
  private int conteudo; 
  private boolean available = false; 
  public synchronized int get(int x) { 
    while (available == false) { 
      try { 
        wait(); 
      } catch (InterruptedException e) { } 
    } 
    available = false; 
    System.out.println(x + conteudo); 
    notifyAll(); return conteudo; 
  } 
  public synchronized void put(int x, int value) { 
    while (available == true) { 
      try { wait(); 
      } catch (InterruptedException e) { } 
    } 
    conteudo = value; 
    available = true; 
    System.out.println(x + conteudo); notifyAll(); 
  } 
} 

