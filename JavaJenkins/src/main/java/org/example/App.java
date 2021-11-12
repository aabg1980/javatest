package org.example;

import org.example.calculadora.Calculadora;
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

        System.out.println("Calculadora  " + Calculadora.sumar(2,2));
        System.out.println("Calculadora  " + Calculadora.restar(2,2));
        System.out.println("Calculadora  " + Calculadora.multiplicar(2,2));
        System.out.println("Calculadora  " + Calculadora.dividir(2,2));
        try {
            System.out.println("Calculadora  " + Calculadora.dividir(2,0));
        }
        catch (ArithmeticException e)
        {
            System.out.println("No se puede dividir por cero" + e.getMessage());
        }
        System.out.println("Calculadora  " + Calculadora.potencia(2,2));
    }
}
