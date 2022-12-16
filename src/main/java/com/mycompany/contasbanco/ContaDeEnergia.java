package com.mycompany.contasbanco;

public class ContaDeEnergia extends Conta {
    private float consumoEmKwh, tarifaPorKwh;
    
    public ContaDeEnergia(String nome,int dia,float consumoEmKwh,float tarifaPorKwh){
        super(nome,dia);
        this.consumoEmKwh=consumoEmKwh;
        this.tarifaPorKwh=tarifaPorKwh;
    }
    
    
    @Override
    public double calcularValor() {
        return consumoEmKwh*tarifaPorKwh+22;
    }
    
}
