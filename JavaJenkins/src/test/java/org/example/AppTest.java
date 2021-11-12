package org.example;

import org.example.calculadora.Calculadora;
import org.example.numeropar.NumeroPar;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void validarSiEspar()
    {
        assertTrue(NumeroPar.esNumeroPar(22));
    }

    @Test
    public void validarSiEsImpar()
    {
        assertFalse(NumeroPar.esNumeroPar(23));
    }

    @Test
    public void validarSuma()
    {
        assertEquals(Calculadora.sumar(10, 20) , 30);
    }

    @Test
    public void validarResta()
    {
        assertEquals(Calculadora.restar(10, 8) , 2);
    }

    @Test
    public void validarMultiplicacion()
    {
        assertEquals(Calculadora.multiplicar(2, 2) , 4);
    }


    @Test
    public void validarDivision()
    {
        assertTrue(Calculadora.dividir(4, 2) == 2);
    }

    /*
    @Test
    public void validarDivisionPorCero()
    {
        try {
            Calculadora.dividir(4, 0);
        }
        catch (ArithmeticException e) {
            assertTrue(e.getMessage().equalsIgnoreCase("No se puede dividir por cero"));
        }


    }*/

    @Test
    public void validarPotencia()
    {
        assertEquals(Calculadora.potencia(2, 3) , 8);
    }
}
