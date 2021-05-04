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
public class AdapterCatToDog extends Cat {
    private Dog adaptee;
    
    public AdapterCatToDog(Dog adaptee){
        this.adaptee = adaptee;
    }
    
    //Override da solicitação
    public void connectCat(){
        adaptee.connectDog();
        System.out.println("DogCat Says: miAUU");
    }
    
}
