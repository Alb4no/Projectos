/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizador;

/**
 * Faz gestao dos enumerados "HOMEM" e "MULHER"
 * @author HumbiHumbi
 */
public enum Genero {
   HOMEM, MULHER,ND;
   
   /**
    * Devolve o genero escolhido pelo utilizador.
    * @param numero
    * @return 
    */
   
    public Genero escolherGenero(int numero) {

        Genero genero = null;

        if (numero == 1) {
              genero=HOMEM;
          }
         else if (numero == 2) {
            return genero=MULHER;
        }

        return genero;
    }
    /**
     * Mostra as informaçoes relactivas ao género.
     * @return 
     */
    @Override
    public String toString() {
        if(this==HOMEM){
            return "Homem";
        }else if(this==MULHER){
            return "Mulher";
        }
        return "Nao escolhido";
    }
    
    

    

   }
