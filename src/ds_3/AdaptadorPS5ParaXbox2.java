/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_3;

/**
 *
 * @author mathe
 */
public class AdaptadorPS5ParaXbox2 extends PS5 {
    private Xbox2 adaptee;
    
    public AdaptadorPS5ParaXbox2(Xbox2 adaptee){
        this.adaptee = adaptee;
    }
    
    //Override da solicitação
    public void conectarPS5(){
        adaptee.conectarXbox2();
        System.out.println("Xbox2");
    }
}
