package com.mycompany.contasbanco;

public class ContaDeAgua extends Conta {

    private float consumoEmMetroCubico,valorPorMetroCubico;
    
    @Override
    public double calcularValor() {
       return consumoEmMetroCubico*valorPorMetroCubico+30;
    }
    
}
