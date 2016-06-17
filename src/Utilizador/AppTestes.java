/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizador;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Classe para testes dos componentes desenvolvidos nas outras classes
 * 
 */
public class AppTestes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*GestorUilizador gestorUtlizador=new GestorUilizador ();
         gestorUtlizador.menuPrincipal(); 
        
        /*Utilizador ut=new Utilizador();
        ut.setNome("Albano");
        ut.setNickname("Tjyakala");
        ut.setPalavrachave("12");*/
        /*System.out.println(ut.toString());*/
        
        /*Data data=new Data(1,1,2015);
        System.out.println(data);*/
         
         Date date=new Date();
         
         SimpleDateFormat formatter=new SimpleDateFormat("dd.MM.yy");
         String output=formatter.format(date);
         //System.out.println(output);
         
         LocalDate date3 = LocalDate.of(2010, Month.MARCH,12);
         //Programar para aparecer em formato diferente, problema resolvido.
         //String outpu=formatter.format(date3);
         //System.out.println(outpu);
         
          //DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yy");
          //String date4 = LocalDate.parse("2010.2.12");
          //System.out.println(date4);
         
        LocalDate dataNascimento  = LocalDate.of(2017, Month.MARCH,12);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yy");
        String out = formatter1.format(dataNascimento);
        System.out.println(out);
     
        
		
         
   
        
        
                
                
                

        
    }
    
}
