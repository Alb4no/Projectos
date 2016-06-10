/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author HumbiHumbi
 */
public class GestorAtividade {
    private Atividade atividade;

    public GestorAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    public void registar(){
    }
    
    
    public void menuPrincipal() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        //acrescer excepcao caso escolham opcao errada.
        do {
            System.out.println("\tMENU PRINCIPAL\n");
            System.out.println("----------- Atividades ---------------- ");
            System.out.println("1- Sincronizar atividade (Mudar de dia)");
            System.out.println("2- Registar uma atividade");
            System.out.println("3- Visualizar informacao do dia");
            System.out.println("");
            System.out.println("------------ Aparelhos ---------------- ");
            System.out.println("4- Registar um novo aparelho");
            System.out.println("5- Remover o aparelho existente");
            System.out.println("6- Reinicializar o aparelho");
            System.out.println("");
            System.out.println("------------ Utilizadores ---------------- ");
            System.out.println("7- Adicionar um amigo");
            System.out.println("8- Remover um amigo");
            System.out.println("0- Encerrar a sessão\n");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    registarUtilizador();
                    break;
                case 2:
                    login();
                    break;

                //default:System.out.println("Opcao inválida");
            }
            break;
        } while (opcao != 0);
    }

    
    
}
