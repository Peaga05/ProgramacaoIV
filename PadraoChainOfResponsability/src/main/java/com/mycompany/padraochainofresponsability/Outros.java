/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraochainofresponsability;

/**
 *
 * @author 20211STADS026
 */
public class Outros implements Setor{

    private Setor proximo;
    
    @Override
    public void tratarProblema(Solicitacao solicitacao) {
        if(solicitacao.getTipo() == TipoProblema.OUTRO){
            System.out.println("Ninguém foi capaz de tratar do seu problema");
        }
    }

    @Override
    public void setProximo(Setor proximo) {
        this.proximo = proximo;
    }
    
}
