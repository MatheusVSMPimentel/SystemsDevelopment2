/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_2;

/**
 *
 * @author mathe
 */
public class Principal {
    
    public static void main(String[] args){
    ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
    ConcessionariaDirector concessionaria2 = new ConcessionariaDirector(new VwBuilder());
    
    concessionaria.construirCarro();
    concessionaria2.construirCarro();
    Carro carro = concessionaria.getCarro();
    Carro carro2 = concessionaria2.getCarro();
        System.out.println("Carro de modelo:" +carro.modelo+" Montadora:" +
                carro.montadora + " Com motor:"+ carro.dscMotor + " Ano de Fabricação:"
        + carro.anoDeFabricação+ " por apenas:R$" +carro.preco);
        System.out.println("");
        System.out.println("Carro de modelo:" +carro2.modelo+" Montadora:" +
                carro2.montadora + " Com motor:"+ carro2.dscMotor + " Ano de Fabricação:"
        + carro2.anoDeFabricação+ " por apenas:R$" +carro2.preco);
    
    }
    
}
