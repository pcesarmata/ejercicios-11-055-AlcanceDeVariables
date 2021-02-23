package com.gamasoft;

public class Aritmetica {
    //Atributos a y b
    int a;
    int b;

    Aritmetica(){

    }

    Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Este metodo sumar toma los atributos de la clase
    int sumar(){
        return a + b;
    }

    // Metodo para restar
    int restar(){
        return a - b;
    }

    // Metodo de multiplicar
    int multiplicar(){
        return a * b;
    }

    // Metodo para dividir
    int dividir (){
        return a / b;
    }
}
