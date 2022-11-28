package com.mycompany.contasbanco;

public abstract class Conta {
    private String nomeDoCliente;
    public int diaDePagamento;
    
    public abstract double calcularValor();
    
}
