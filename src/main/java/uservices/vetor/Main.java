/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uservices.vetor;

import java.lang.reflect.Array;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        
        VetorObjeto vetor = new VetorObjeto();
        
        for(int i = 0; i < 10; i++){
            vetor.adicionaElemento(i);
        }
        
         System.out.println(vetor);
         
         vetor.adicionaElemento("alou");
         
         
         System.out.println(vetor);
    }
}