/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraochainofresponsability;

/**
 *
 * @author 20211STADS026
 */
public class Vendas implements Setor{
    
    private Setor proximo;
    
    @Override
    public void tratarProblema(Solicitacao solicitacao) {
        if(solicitacao.getTipo() == TipoProblema.VERIFICACAO_BANDEIRA || solicitacao.getTipo() == TipoProblema.NOVO_PEDIDO){
            System.out.println("O setor de vendas tratou a requisição!");
        }else{
            proximo.tratarProblema(solicitacao);
        }
    }

    @Override
    public void setProximo(Setor proximo) {
        this.proximo = proximo;
    }
    
}
