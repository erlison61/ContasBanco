package com.mycompany.contasbanco;

public class ContaDeAgua extends Conta {

    private float consumoEmMetroCubico,valorPorMetroCubico;
    
    public ContaDeAgua(String nome,int dia,float consumoEmMetroCubico,float valorPorMetroCubico){
        super(nome,dia);
        this.consumoEmMetroCubico=consumoEmMetroCubico;
        this.valorPorMetroCubico=valorPorMetroCubico;
    }
    
    @Override
    public double calcularValor() {
       return consumoEmMetroCubico*valorPorMetroCubico+30;
    }

   
}
