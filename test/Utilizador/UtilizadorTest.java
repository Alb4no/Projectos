/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizador;

import Dispositivo.Dispositivo;
import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HumbiHumbi
 */
public class UtilizadorTest {
    LocalDate dataNascimento  = LocalDate.of(2017, Month.MARCH,12);
    Utilizador utilizador = new Utilizador("Albano","Alb","qwe456",dataNascimento,Genero.HOMEM,1.7,2.7);
    
    public UtilizadorTest() {
    }
    
    

    /**
     * Test of getNome method, of class Utilizador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        //Utilizador utilizador = new Utilizador();
        //utilizador.setNome("José");
        String expResult = "Albano";
        String resultado = utilizador.getNome();
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Utilizador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String expResult = "Jack";
        //Utilizador instance = new Utilizador();
        utilizador.setNome("Jack");
        assertEquals(expResult,utilizador.getNome());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNickname method, of class Utilizador.
     */
    @Test
    public void testGetNickname() {
        System.out.println("getNickname");
        //Utilizador instance = new Utilizador();
        String expResult = "Alb";
        String result = utilizador.getNickname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNickname method, of class Utilizador.
     */
    @Test
    public void testSetNickname() {
        System.out.println("setNickname");
         String expResult = "Gomes";
        //Utilizador instance = new Utilizador();
        utilizador.setNickname(expResult);
        String result=utilizador.getNickname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPalavraPasse method, of class Utilizador.
     */
    @Test
    public void testGetPalavraPasse() {
        System.out.println("getPalavraPasse");
       // Utilizador instance = new Utilizador();
        String expResult = "qwe123";
        String result = utilizador.getPalavraPasse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPalavraPasse method, of class Utilizador.
     */
    @Test
    public void testSetPalavraPasse() {
        System.out.println("setPalavraPasse");
        String expResult = "ABC007";
        //Utilizador instance = new Utilizador();
        utilizador.setPalavraPasse(expResult);
        String result=utilizador.getPalavraPasse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Utilizador.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Utilizador instance = new Utilizador();
        Data expResult = null;
        Data result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Utilizador.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        Data DataNascimento = null;
        Utilizador instance = new Utilizador();
        instance.setDataNascimento(DataNascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenero method, of class Utilizador.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Utilizador instance = new Utilizador();
        Genero expResult = null;
        Genero result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenero method, of class Utilizador.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        int numero = 0;
        Utilizador instance = new Utilizador();
        instance.setGenero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Utilizador.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Utilizador instance = new Utilizador();
        double expResult = 0.0;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Utilizador.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        double altura = 0.0;
        Utilizador instance = new Utilizador();
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Utilizador.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Utilizador instance = new Utilizador();
        double expResult = 0.0;
        double result = instance.getPeso();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class Utilizador.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        double peso = 0.0;
        Utilizador instance = new Utilizador();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilizador method, of class Utilizador.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Utilizador instance = new Utilizador();
        Dispositivo expResult = null;
        Dispositivo result = instance.getUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUtilizador method, of class Utilizador.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Dispositivo utilizador = null;
        Utilizador instance = new Utilizador();
        instance.setUtilizador(utilizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPartilharInformacao method, of class Utilizador.
     */
    @Test
    public void testIsPartilharInformacao() {
        System.out.println("isPartilharInformacao");
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.isPartilharInformacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartilharInformacao method, of class Utilizador.
     */
    @Test
    public void testSetPartilharInformacao() {
        System.out.println("setPartilharInformacao");
        boolean partilharInformacao = false;
        Utilizador instance = new Utilizador();
        instance.setPartilharInformacao(partilharInformacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Utilizador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Utilizador instance = new Utilizador();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Utilizador.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Utilizador instance = new Utilizador();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Utilizador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarString method, of class Utilizador.
     */
    @Test
    public void testValidarString() {
        System.out.println("validarString");
        String novaString = "";
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.validarString(novaString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarPalavraPasse method, of class Utilizador.
     */
    @Test
    public void testValidarPalavraPasse() {
        System.out.println("validarPalavraPasse");
        String palavraPasse = "";
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.validarPalavraPasse(palavraPasse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarGenero method, of class Utilizador.
     */
    @Test
    public void testValidarGenero() {
        System.out.println("validarGenero");
        Genero genero = null;
        Utilizador instance = new Utilizador();
        Genero expResult = null;
        Genero result = instance.validarGenero(genero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarAltura method, of class Utilizador.
     */
    @Test
    public void testValidarAltura() {
        System.out.println("validarAltura");
        double altura = 0.0;
        Utilizador instance = new Utilizador();
        double expResult = 0.0;
        double result = instance.validarAltura(altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarPeso method, of class Utilizador.
     */
    @Test
    public void testValidarPeso() {
        System.out.println("validarPeso");
        double peso = 0.0;
        Utilizador instance = new Utilizador();
        double expResult = 0.0;
        double result = instance.validarPeso(peso);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
