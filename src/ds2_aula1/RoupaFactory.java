/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_aula1;

/**
 *
 * @author mathe
 */
public class RoupaFactory  {
     
    public Roupa getRoupa(int n){
        
      switch(n){
          case 1: ;return new Saia();
          default: return new Vestido();
         
      }
    }
}
