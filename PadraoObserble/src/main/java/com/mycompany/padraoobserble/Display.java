package com.mycompany.padraoobserble;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 20211STADS026
 */
public class Display implements Observer{//View
    Observable dadosDoSensor;

    public Display(Observable DadosDoSensor) {
        this.dadosDoSensor = DadosDoSensor;
        dadosDoSensor.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof SensorDeTemperatura){
            SensorDeTemperatura sdt = (SensorDeTemperatura)o;
            System.out.println("Temperatura aferida: " + sdt.getTemperatura());
        }
    }
    
    
    
}
