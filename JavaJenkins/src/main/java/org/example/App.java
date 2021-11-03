package org.example;

import org.example.numeropar.NumeroPar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numero = 22;
        System.out.println( "Programa del numero par" );
        System.out.println(" Vamos a ver si  " + numero + " es par?");
        System.out.println( numero + " es par? " + NumeroPar.esNumeroPar(numero));
    }
}
