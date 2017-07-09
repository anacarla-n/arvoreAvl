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
public class TesteArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        MenuArvoreTeste menu = new MenuArvoreTeste();
        int op = 0;
        while (op != 6) {

            System.out.println("#######MENU#######");
            System.out.println("1. Inserir jogo");
            System.out.println("2. Buscar jogo");
            System.out.println("3. Atualizar jogo");
            System.out.println("4. Listar Jogos Ordenados");
            System.out.println("5. Listar Jogos Pos Ordenados");
            System.out.println("6. Listar Jogos Pre Ordenados");
            System.out.println("5. Sair");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    menu.adicionar();
                    break;
                case 2:
                    menu.buscarElemento();
                    break;
                    
                case 4:
                    menu.imprimirEmOrd();
                    break;
                case 5:
                    menu.imprimirPosOrd();
                    break;
                case 6:
                    menu.imprimirPreOrd();
                    break;
                
                    
            }
        }
    }

}
