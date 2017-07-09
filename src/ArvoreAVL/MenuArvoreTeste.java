/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreAVL;

import java.util.Scanner;

/**
 *
 * @author Ana Carla
 */
public class MenuArvoreTeste {
    
    Scanner ler = new Scanner(System.in);

    ArvoreAVL<Integer> inteiros = new ArvoreAVL<>();

    public void adicionar() {
//        Jogo j = new Jogo();
      
        int j = ler.nextInt();
        inteiros.insert(j);
    }
    
    public void buscarElemento(){
        Jogo j = new Jogo();
        System.out.print("Informe o codigo do jogo:");
        j.setCodJogo(ler.nextInt());
        if(inteiros.buscarElemento(j)){
            System.out.println("Encontrou:"+j.getCodJogo());
        }else{
            System.out.println("Objeto não existe");
        }
    }
        
    public void imprimirPosOrd(){
        inteiros.pecorrerPosOrd(inteiros.getRaiz());
    }
    
    public void imprimirPreOrd(){
        inteiros.pecorrerPreOrd(inteiros.getRaiz());
    }
    
    public void imprimirEmOrd(){
        inteiros.pecorrerOrd(inteiros.getRaiz());
    }
       
    
}
