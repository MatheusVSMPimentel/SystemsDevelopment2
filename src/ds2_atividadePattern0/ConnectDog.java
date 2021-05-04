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
public class ConnectDog {
    private Dog sensorAQueSeConecta;
    
    public void connect(Dog sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.connectDog();
    }
}
