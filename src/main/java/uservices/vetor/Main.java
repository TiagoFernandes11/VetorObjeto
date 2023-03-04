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
        
        VetorObjeto vetorClientes = new VetorObjeto();
        
        System.out.println("Adição dos clientes: ");
        
        vetorClientes.adicionaElemento(new Clientes("Davi","999995979"));
        vetorClientes.adicionaElemento(new Clientes("João Batista","12345678"));
        vetorClientes.adicionaElemento(new Clientes("José","40509080"));
        vetorClientes.adicionaElemento(new Clientes("Asa","40028922"));
        vetorClientes.adicionaElemento(new Clientes("Salomão","69696969"));
        
        System.out.println("");
        System.out.println("Fila de clientes:");
        System.out.println(vetorClientes);
        System.out.println("Tamanho da fila: " + vetorClientes.tamanho());
        
        System.out.println("");
        System.out.println("Após a remoção do terceiro cliente: ");
        vetorClientes.remove(2);
        System.out.println(vetorClientes);
        System.out.println("Tamanho da fila: " + vetorClientes.tamanho());
    
    
    }
    
}