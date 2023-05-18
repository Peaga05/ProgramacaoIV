/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.padraointerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author 20211STADS026
 */
public class PadraoInterator {

    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        
        nome.add("João");
        nome.add("Maria");
        nome.add("Peaga");
        nome.add("Guilherme");
        nome.add("Jhennifer");
        Iterator<String> iterator = nome.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        Map<String, Integer> notas = new HashMap<>();
        notas.put("João", 10);
        notas.put("Maria", 10);
        notas.put("Peaga", 10);
        notas.put("Jhennifer", 10);
        notas.put("Guilherme", 10);
        
        Iterator<Map.Entry<String, Integer>> iteratro2 = notas.entrySet().iterator();
         while(iteratro2.hasNext()){
            Iterator<Map.Entry<String, Integer>> aux = (Iterator<Map.Entry<String, Integer>>) iteratro2.next();
            System.out.println(aux.getKey());
            System.out.println(aux.getValue());
        }
        
    }
}
