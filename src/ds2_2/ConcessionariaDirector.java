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
public class ConcessionariaDirector {

    protected CarroBuilder montadora;

    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;

    }
    
    public void construirCarro(){
    montadora.buildPreco();
    montadora.buildAnoDeFabricacao();
    montadora.buildModelo();
    montadora.buildMontadora();
    montadora.builDscMotor();
    }

    public Carro getCarro() {
        return montadora.getCarro();
    }
    
    
}
