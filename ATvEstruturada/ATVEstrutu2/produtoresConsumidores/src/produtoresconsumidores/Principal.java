/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoresconsumidores;

public class Principal { 
   public static void main(String args[]){ 
     Produto produto = new Produto(); 
     Consumidor consumidor = new Consumidor(produto, 3); 
     Produtor produtor = new Produtor(produto, 2); 
     consumidor.start();  produtor.start(); 
  } 
}

 


 
    

