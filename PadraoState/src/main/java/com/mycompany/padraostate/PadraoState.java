/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.padraostate;

/**
 *
 * @author 20211STADS026
 */
public class PadraoState {

    public static void main(String[] args) {
        Alerta alerta = new Alerta();
        alerta.notificar();
        alerta.setSemafaroAtual(new SemafaroVerde());
        alerta.notificar();
          alerta.setSemafaroAtual(new SemafaroAmarelo());
        alerta.notificar();
    }
}
