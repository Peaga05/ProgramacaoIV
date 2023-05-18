/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividadepedido;

/**
 *
 * @author 20211STADS026
 */
public class AtividadePedido {

    public static void main(String[] args) {
        Pedido pd = new Pedido();
        pd.setStatus(new StatusAguardando());
        
        TelaPedido tp = new TelaPedido();
        tp.setTxtNome("Galaxy S23");
        tp.setTxtNumPedido("123");
        tp.setTxtQuant("1");
        tp.setTxtStatus(pd.notificar());
        tp.setVisible(true);
    }
}
