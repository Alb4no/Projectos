/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizador;

/**
 * Faz a gestao de datas.
 * @author HumbiHumbi
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    /**
     * Construtor sem parametros.
     */
    public Data() {
    }

   /**
    * Construtor com todos os parametros.
    * @param dia
    * @param mes
    * @param ano 
    */
    public Data(int dia, int mes, int ano) {
        this.dia = validarDia(dia);
        this.mes = validarMes(mes);
        this.ano = validarAno(ano);
    }

    /**
     * Retorna o dia.
     * @return 
     */
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = validarDia(dia);
    }
    /**
     * Retorna o mes.
     * @return 
     */
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = validarMes(mes);
    }

    /**
     * Retorna o ano.
     * @return 
     */
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = validarAno(ano);
    }
    /**
     * Valida o dia introduzido.
     * @param dia
     * @return 
     */
    public int validarDia( int dia){
        int retornarDia = 1;
       
        if (dia > 0 && dia <= 31) {
            retornarDia = dia;
            return retornarDia;
        }
        return retornarDia;
    }
    
    /**
     * Valida o mes introduzido.
     * @param mes
     * @return 
     */
    public int validarMes(int mes){
        int retornarMes = 1;
       
        if (mes > 0 && mes <=12) {
            retornarMes =mes;
            return retornarMes;
        }
        return retornarMes;
    }
    /**
     * Valida o ano introduzido.
     * @param ano
     * @return 
     */
    public int validarAno(int ano){
        int retornarAno = 2016;
       
        if (ano>=2016) {
            retornarAno =ano;
            return retornarAno;
        }
        return retornarAno;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Data other = (Data) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        return true;
    }
    /**
     * Display, mostra o dia, mes e ano.
     * @return 
     */
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    } 
    
}
