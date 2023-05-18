/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepedido;

/**
 *
 * @author 20211STADS026
 */
public class Pedido {
    private Status status;
            
    public Pedido(){
        this.status = new StatusAguardando();
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public String notificar(){
        return this.status.alterarStatus();
    }
}
