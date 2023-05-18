/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.padraoobserble;

import javax.swing.JOptionPane;

/**
 *
 * @author 20211STADS026
 */
public class PadraoObserble { //Controller

    public static void main(String[] args) {
       SensorDeTemperatura sdt = new SensorDeTemperatura();
       DisplayTemperatura tela = new DisplayTemperatura(sdt);
       sdt.setTemperatura(36);
       JOptionPane.showMessageDialog(null, "Palmeiras não tem Mundial");
       sdt.setTemperatura(50);
       
    }
}
