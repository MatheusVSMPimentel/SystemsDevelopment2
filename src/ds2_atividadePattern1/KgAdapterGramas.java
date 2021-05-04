/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_atividadePattern1;

/**
 *
 * @author mathe
 */
public class KgAdapterGramas extends Kg {

    private Gramas grama;

    public  KgAdapterGramas(Gramas grama) {
        this.grama = grama;

    }

    @Override
    public float quilos(float kgs){
        return this.grama.calcular(kgs);
    } 
}
