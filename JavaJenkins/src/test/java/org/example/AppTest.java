package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.example.numeropar.NumeroPar;
import org.junit.Test;

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
}
