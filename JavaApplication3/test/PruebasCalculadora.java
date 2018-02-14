/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YS
 */
public class PruebasCalculadora {
    
    private Calculadora calculadora;
    
    public PruebasCalculadora() 
    { 
        calculadora = new Calculadora();
    }
    
    @Test
    public void pruebaSuma()
    {
       calculadora.setNumero1(5);
       calculadora.setNumero2(8);
       int resultado = calculadora.sumar();
       int esperado = 13;
       assertEquals(esperado, resultado);
    }
    @Test
    public void pruebaResta()
    {
       calculadora.setNumero1(5);
       calculadora.setNumero2(8);
       int resultado = calculadora.restar();
       int esperado = -3;
       assertEquals(esperado, resultado);
    }
}