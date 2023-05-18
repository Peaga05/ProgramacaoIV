/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraostate;

/**
 *
 * @author 20211STADS026
 */
public class Alerta {
    private Semafaro semafaroAtual;
    
    public Alerta(){
        this.semafaroAtual = new SemafaroVermelho();
    }

    public void setSemafaroAtual(Semafaro novoSemafaro) {
        this.semafaroAtual = novoSemafaro;
    }
    
    public void notificar(){
        this.semafaroAtual.notificar();
    }
    
    
}
