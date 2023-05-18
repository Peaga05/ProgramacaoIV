/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoobserble;

import java.util.Observable;

/**
 *
 * @author 20211STADS026
 */
public class SensorDeTemperatura extends Observable {//Model
    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers();
    }
    
    public SensorDeTemperatura() {
        
    }
    
    
}
