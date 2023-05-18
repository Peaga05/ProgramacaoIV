/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraochainofresponsability;

/**
 *
 * @author 20211STADS026
 */
public class Financeiro implements Setor{
    
    private Setor proximo;
    
    @Override
    public void tratarProblema(Solicitacao solicitacao) {
        if(solicitacao.getTipo() == TipoProblema.PROCESSAMENTO_PAGAMENTO 
                || solicitacao.getTipo() == TipoProblema.CONFIRMACAO_PAGAMENTO
                || solicitacao.getTipo() == TipoProblema.EMISSAO_NOTA){
             System.out.println("Setor de finaceiro tratou da devolução");
        }else{
            proximo.tratarProblema(solicitacao);
        }
        
    }

    @Override
    public void setProximo(Setor proximo) {
        this.proximo = proximo;
    }
    
}
