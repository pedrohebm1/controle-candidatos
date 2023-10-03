package com.dio.desafiocontrolefluxo;

public class ParametroInvalidosException extends Exception {

    int parameterOne, parameterTwo;
    public ParametroInvalidosException(int parameterOne, int parameterTwo) {
        super();
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
    }

    @Override
    public String toString() {
        return "O primeiro número("+parameterOne+") é maior que o segundo número("+parameterTwo+").";
    }
}
