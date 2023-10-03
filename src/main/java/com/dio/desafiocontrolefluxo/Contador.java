package com.dio.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro");
        int parameterOne = scanner.nextInt();
        System.out.println("Insira o segundo parâmetro");
        int parameterTwo = scanner.nextInt();

        try {
            contar(parameterOne, parameterTwo);
        } catch(Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parameterOne, int parameterTwo) throws ParametroInvalidosException {
        if (parameterOne > parameterTwo) {
            throw new ParametroInvalidosException(parameterOne, parameterTwo);
        }
        int valor = parameterTwo-parameterOne;
        for (int i = 1; i<valor;i++){
            System.out.println(i);
        }
    }
}
