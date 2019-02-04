/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2herramientajava;

/**
 *
 * 
 */

public class SingletonNormie 
{
  
    private static SingletonNormie instanciado = null;
   
   protected SingletonNormie() 
   {
      // solo para evitar instanciar
   }
   public static SingletonNormie getInstanciado() {
      
      if(instanciado == null) 
      {
         instanciado = new SingletonNormie();
      }
      return instanciado;
   }
}
