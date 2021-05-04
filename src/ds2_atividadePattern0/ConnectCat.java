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
public class ConnectCat {
    private Cat sensorAQueSeConecta;
    
    public void connect(Cat sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.connectCat();
    }
}
