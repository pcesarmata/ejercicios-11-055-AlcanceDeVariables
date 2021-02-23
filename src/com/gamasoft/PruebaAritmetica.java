package com.gamasoft;

public class PruebaAritmetica {
    public static void main(String[] args) {
       // Variables locales
        int operandoA = 6;
        int operandoB = 2;

        Aritmetica objAritmetica = new Aritmetica(operandoA, operandoB);

        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        // Imprimimos el resultado de la suma
        System.out.println("Resultado de la suma = " + objAritmetica.sumar());

        // Imprimimos el resultado de la resta
        System.out.println("Resultado de la resta = " + objAritmetica.restar());

        // Imprimimos el resultado de la multiplicación
        System.out.println("Resultado de la multiplicación = " + objAritmetica.multiplicar());

        // Imprimimos el resultado de la division
        System.out.println("Resultado de la división = " + objAritmetica.dividir());
    }
}
