/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizador;

import java.util.ArrayList;
import java.time.LocalDate;
import Dispositivo.Dispositivo;

/**
 * Faz a gestao do utilizador.
 * @author Albano Tjyakala.
 * 
 */
public class Utilizador {
    
    private String nome;
    private String nickname;
    private String palavraPasse;
    private LocalDate DataNascimento;
    private Genero genero;
    private double altura;
    private double peso;
    public static int quantosUtilizadores=0;
    private int id;
    private ArrayList listaDeAmigos;
    private Dispositivo utilizador;
    private boolean partilharInformacao;
    
    
    /**
     * Cria um da Utilizador sem parametros.
     * O id é auto incremente, por isso deve estar em todos os construtores da classe.
     */
    public Utilizador() {
        this.id = ++quantosUtilizadores;
    }

    /**
     * Cria uma instância da classe Utilizador com parametros.
     * @param nome
     * @param nickname
     * @param palavraPasse
     * @param DataNascimento
     * @param genero 
     */
    public Utilizador(String nome, String nickname, String palavraPasse, LocalDate DataNascimento,Genero genero,double altura,double peso) {
        this.nome = validarString(nome);
        this.nickname = validarString(nome);
        this.palavraPasse = validarPalavraPasse(palavraPasse);
        this.DataNascimento = DataNascimento;
        this.genero = validarGenero(genero);
        this.altura = validarAltura(altura);
        this.peso = validarPeso(peso);
        this.id = ++quantosUtilizadores;
        listaDeAmigos = new ArrayList();
        partilharInformacao = false;
    }

    /**
     * Retorna o nome do utilizador.
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome.
     * @param nome 
     */
     public void setNome(String nome) {
         validarString(nome);
     }
    /**
     * Retorna o nickname do utilizador.
     * @return 
     */
    public String getNickname() {
        return nickname;
    }
    /**
     * Define o nickname.
     * @param nickname 
     */
    public void setNickname(String nickname) {
        validarString(nickname);
    }
    /**
     *Retorna a palavra chave do utilizador. 
     * @return 
     */
    public String getPalavraPasse() {
        return palavraPasse;
    }
    /**
     * Define a palavra passe. 
     * @param palavrachave 
     */
    public void setPalavraPasse(String palavrachave) {
        validarPalavraPasse(palavrachave);
    }
    /**
     * Retorna a data de nascimento do utilizador. 
     * @return 
     */
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }
    /**
     * Define a data de nascimento.
     * @param DataNascimento 
     */
    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    /**
     * Retorna o genero do utilizador. 
     * @return 
     */
    public Genero getGenero() {
        return genero;
    }
    /**
     *  Define o género.
     * @param genero 
     */
    public void setGenero(int numero) {
        if(numero==1){
           this.genero=Genero.HOMEM;
        }else if(numero==2){
             this.genero=Genero.MULHER;
        }else{
              this.genero=Genero.ND;
        }
    } 

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        validarAltura(altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        validarPeso(peso);
    }

    public Dispositivo getUtilizador() {
        return utilizador;
    }
    /**
     * Nao faz sentido.
     * @param utilizador 
     */
    public void setUtilizador(Dispositivo utilizador) {
        this.utilizador = utilizador;
    }
    
    /**
     * Retorna o estado do utlizador quanto a partilha de informacao.
     * @return 
     */
    public boolean isPartilharInformacao() {
        return partilharInformacao;
    }
    
    /**
     * Altera o estado da partilha de informacao.
     * @param partilharInformacao 
     */
    public void setPartilharInformacao(boolean partilharInformacao) {
        this.partilharInformacao = partilharInformacao;
    }
    
    /**
     * Devolve o id do utilizador.
     * Sendo este (id) auto increment.
     * @return 
     */
    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilizador other = (Utilizador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    /**
     * Faz validação de Strings.
     */
    public String  validarString(String novaString) throws UtilizadorException{
        String retornar="";
        if(novaString.equals("")){
           retornar=novaString;
           throw new UtilizadorException("Nao deve ser nula");
          }
             return retornar;
      }
     
     /**
      * Faz a validação da palavraPasse.
      * @param novaString
      * @return 
      */
     public String  validarPalavraPasse(String palavraPasse) throws  UtilizadorException {
          String retornar="";
        if(palavraPasse.equals("")){
           retornar=palavraPasse;
           throw new UtilizadorException("Palavra passe inferior a 6 caracteres ou está vazia \nRetifique a sua palavra passe");
            }
           return retornar;
     }
     
     public Genero validarGenero(Genero genero){
         Genero retornar=Genero.ND; 
         
         if(genero==Genero.HOMEM){
              retornar=Genero.HOMEM;
              return retornar;
       }else if(genero==Genero.MULHER){
              retornar=Genero.MULHER;
               return retornar;
       }
             return retornar;
         
     } 
     
     /**
      * Valida altura do utilizador
      */
      public double validarAltura(double altura){
          double retornar=0.0;
          
          if(altura>0 && altura<3){
             retornar=altura;
          }
          
          return retornar;
      }
     
      /**
      * Valida o peso do utilizador.
      * @param peso
     * @return 
      */
     public double validarPeso(double peso){
          double retornar=0.0;
          
          if(peso>0 || peso<250){
             retornar=peso;
          }
          
          return retornar;
      } 
    
    /**
     * Devolve informacoes do utilizador (nome,nickname e id)
     * @return 
     */
    @Override
    public String toString() {
        return "Utilizador "+id+":" + "\nNome:" + nome + "\nNickname:" + nickname;
    }
    
    
    
    
    
}
