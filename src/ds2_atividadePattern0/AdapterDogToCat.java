/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_atividadePattern0;

/**
 *
 * @author mathe
 */
public class AdapterDogToCat extends Dog {
    private Cat adaptee;
    
    public AdapterDogToCat(Cat adaptee){
        this.adaptee = adaptee;
    }
    
    //Override da solicitação
    public void connectDog(){
        adaptee.connectCat();
        System.out.println("DogCat Says: miAUU");
    }
    
}
