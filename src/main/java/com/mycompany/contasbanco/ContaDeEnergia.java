package com.mycompany.contasbanco;

public class ContaDeEnergia extends Conta {
    private float consumoEmKwh, tarifaPorKwh;
    
    @Override
    public double calcularValor() {
        return consumoEmKwh*tarifaPorKwh+22;
    }
    
}
