package org.example.numeropar;

public class NumeroPar {

    public static boolean esNumeroPar(int numero)
    {
        if(numero<=0)
            throw new RuntimeException("No es un numero positivo " + numero);
        if(numero%2==0)
            return true;
        return false;

    }
}
