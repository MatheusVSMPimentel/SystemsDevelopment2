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
public class VwBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.preco = 35000.00;
    }

    @Override
    public void builDscMotor() {
        carro.dscMotor = "1.6";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricação = 2012;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Algum carro massa";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Vw";
    }
    
}
