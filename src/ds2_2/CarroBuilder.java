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
public abstract class CarroBuilder {
    protected Carro carro;
    public CarroBuilder(){
        carro = new Carro();
    }
    
    public abstract void buildPreco();
    
    public abstract void builDscMotor();
    
    public abstract void buildAnoDeFabricacao();
    
    public abstract void buildModelo();
    
    public abstract void buildMontadora();
    
    public Carro getCarro(){
        return carro;
    }
    
    
    
}
