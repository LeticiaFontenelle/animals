
package com.mycompany.animals;
/**
 *
 * @lf
 */
public class animals {
   public static void main (String [] args){ 
     // Animal n = new Animal (0); -> Forçando erro  
     // -> Motivo: Animal é abstrato e não pode ser instanciado.      
     Mamifero m = new Mamifero(); 
     Reptil r = new Reptil(); 
     Peixe p = new Peixe(); 
     Ave a = new Ave();
     Canguru c = new Canguru();
     Cachorro k = new Cachorro();        
     Cobra j = new Cobra();      
     Tartaruga t = new Tartaruga();         
     GoldFish  g = new GoldFish();       
     Arara e = new Arara();        
                  
     
     c.locomover(); 
     k.locomover(); 
     c.emitirSom(); 
     k.emitirSom(); 
     
     
     
   } 
}
