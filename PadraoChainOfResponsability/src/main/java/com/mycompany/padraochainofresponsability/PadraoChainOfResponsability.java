package com.mycompany.padraochainofresponsability;

/**
 *
 * @author 20211STADS026
 */
public class PadraoChainOfResponsability {

    public static void main(String[] args) {
        Solicitacao sl = new Solicitacao(TipoProblema.EMISSAO_NOTA);
        Solicitacao s2 = new Solicitacao(TipoProblema.DEVOLUCAO);
        Solicitacao s3 = new Solicitacao(TipoProblema.NOVO_PEDIDO);
        Solicitacao s4 = new Solicitacao(TipoProblema.OUTRO);
        
        Setor suporte = new Suporte();
        Setor financeiro = new Financeiro();
        Setor venda = new Vendas();
        Setor outro = new Outros();
        
        suporte.setProximo(financeiro);
        financeiro.setProximo(venda);
        venda.setProximo(outro);
        
        suporte.tratarProblema(sl);
        suporte.tratarProblema(s2);
        suporte.tratarProblema(s3);
        suporte.tratarProblema(s4);
        
    }
}
