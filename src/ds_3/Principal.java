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
public class Principal {
    public static void main(String[] args) {
        
        //Tem-se um Xbox2 mas deseja-se usar um controle ps2:
        Xbox2 adaptee = new Xbox2();
        ControlePS5 target = new ControlePS5();
        
        //Cria-se um falso sensor de PS5 que, na verdade, Traduz e repassa
        AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);
        
        //Conecta-se o controle ao adapter
        target.Conectar(adapter);
    }
}
