/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.String.format;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Faz gestao da informacao dos objectos da classe utilizador.
 * @author HumbiHumbi
 */
public class GestorUilizador {
    private Utilizador utilizador;
    private static ArrayList listaDeAmigos;
   
    /**
     * Cria um um novo utilizador.
     */
    public GestorUilizador() {
         this.utilizador = new Utilizador();
     }
    /**
     * Retorna o  utilizador. 
     * @return 
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }
    /**
     * Acho que nao sentido este método.
     * @param utilizador 
     */
    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
    
    /**
     * Apresenta o menu principal.
     */
    public void menuPrincipal() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        //acrescer excepcao caso escolham opcao errada.
        do {
            System.out.println("\tMENU PRINCIPAL\n");
            System.out.println("1- Registar novo utilizador");
            System.out.println("2- Autenticar-se");
            System.out.println("0- Sair\n");
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

    /**
     * Faz o registo de utilizador em.
     */
    public void registarUtilizador()  {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("\tREGISTAR UTILIZADOR\n");

        System.out.println("Nome:");
         String nome=sc.nextLine();
      
        System.out.println("Nickname:");
         String nickname=sc.nextLine();
        
        System.out.println("Palavra chave:");
        String palavraPasse=sc.nextLine();
       
        System.out.println("Data de Nascimento:");
        int dia=sc.nextInt();
        String mes=sc.nextLine();
        int ano=sc.nextInt();
        LocalDate dataNascimento  = LocalDate.of(ano, Month.MARCH,dia);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String out = formatter.format(dataNascimento);
       
        Genero genero=null;
        System.out.println("Género – Homem (1) ou Mulher (2):");
        genero.escolherGenero(sc.nextInt());
        
       /* System.out.println("Foto (opcional):");
        utilizador.
        sc.nextLine();*/
        
        System.out.println("Altura (cm):");
        double altura=sc.nextDouble();
        
        System.out.println("Peso (kg):");
         double peso=sc.nextDouble();
        
        this.utilizador=new Utilizador(nome, nickname, palavraPasse, dataNascimento, genero, altura, peso);
        
        
       
        
      
        
        //Criacao de ficheiro.
        String nomeFicheiro="C:\\RegistoUtilizadores\\ficheiro.txt";
        File registo = new File(nomeFicheiro);
        
        try{
            FileWriter fileWriter= new FileWriter(registo);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bufferedWriter);
            
            printWriter.println(utilizador.getNome()+"Nome:"+utilizador.getNickname());
            printWriter.println(utilizador.getNickname());
            printWriter.println(utilizador.getPalavraPasse());
            printWriter.println(utilizador.getDataNascimento());
            printWriter.println(utilizador.getGenero());
            /*printWriter.println(fotografia);*/
            printWriter.println(utilizador.getPeso());
            printWriter.println(utilizador.getAltura());
            
            
            printWriter.flush();
            printWriter.close();
        
        }catch(IOException e){
            System.out.println("Erro: "+e);
        }
        
   }
    
   

    /**
     * Ecrã de autenticacao do utilizador.
     */
    public void login() {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nickname:");
        String nickname = sc.nextLine();

        System.out.println("Palavrachave:");
        String palavraChave = sc.nextLine();

    }
    
      /**
        * Remove amigo (caso esse esteja na lista).
        * @param utilizador 
        */
       public void adicionarUtilizadorArray(Utilizador utilizador) {
           for(int i=0;i<listaDeAmigos.size();i++){
                if(!listaDeAmigos.get(i).equals(utilizador.getNickname())){
                   listaDeAmigos.add(utilizador);
                }
             } 
       }
     
       /**
        * Percorre o array de amigos e adiciona um novo amigo na 
        * lista caso nao exista um amigo com o mesmo nickname.
        * @param nickname, usado para identificar o utilizador a ser removido. 
        */
       public void removerAmigos(String nickname) {
           for(int i=0;i<listaDeAmigos.size();i++){
                if(listaDeAmigos.get(i).equals(nickname)){
                   listaDeAmigos.remove(i);
                }
           }
        
       }
     
     /**
     * Partilha ainformacao do utilizador.
     *
     * @return
     */
    public String partilharInformacao() {
        return utilizador.getNickname() + "";
    }

    /**
     * Layout que mostra o nome do utilizador.
     * @return 
     */
    @Override
    public String toString() {
        return "GestorUilizador{" + "utilizador=" + utilizador.getNome() + '}';
    }
    
    
     
    

}
