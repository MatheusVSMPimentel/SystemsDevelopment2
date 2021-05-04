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
public class ControlePS5 {
    private PS5 sensorAQueSeConecta;
    
    public void Conectar(PS5 sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarPS5();
    }
    
}
