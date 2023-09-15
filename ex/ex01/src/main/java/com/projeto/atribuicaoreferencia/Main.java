package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args){

        int intA = 1;
        int intB = intA;

        System.out.println("IntA=" + intA + " intB=" + intB);
        intA = 2;
        System.out.println("IntA=" + intA + " intB=" + intB);

        /*COM OS OBJETOS NÃO FUNCIONA ASSIM, PORQUE VAI RECEBER UMA REFERENCIA DA MEMORIA*/

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA=" + objA + " objB=" + objB);
        objA.setNum(5);
        System.out.println("objA=" + objA + " objB=" + objB);
        //agora o objB também vai valer 5 porque o que o objeto recebe é uma referencia de memoria

    }
}
