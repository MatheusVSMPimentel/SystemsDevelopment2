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
public class main {
    public static void main(String[] args) {
          
        //Tem-se um Xbox2 mas deseja-se usar um controle ps2:
        Cat adapteeCat = new Cat();
        Dog adapteeDog = new Dog();
        ConnectDog targetDog = new ConnectDog();
        ConnectCat targetCat = new ConnectCat();
        
        //Cria-se um falso sensor de PS5 que, na verdade, Traduz e repassa
        AdapterDogToCat adapterDog = new AdapterDogToCat(adapteeCat);
        AdapterCatToDog adapterCat = new AdapterCatToDog(adapteeDog);
        
        //Conecta-se o controle ao adapter
        targetDog.connect(adapterDog);
        targetCat.connect(adapterCat);
        
    }
}
