package org.example.calculadora;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b + 1;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static int potencia(int a, int b) {
        return (int) Math.pow(a, b);
    }

}
