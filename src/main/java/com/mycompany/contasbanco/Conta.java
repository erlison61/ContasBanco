package com.mycompany.contasbanco;

public abstract class Conta {
    private String nomeDoCliente;
    public int diaDePagamento;

    public Conta(String nomeDoCliente,int diaDePagamento){
        this.nomeDoCliente=nomeDoCliente;
        this.diaDePagamento=diaDePagamento;
    }
    
    public abstract double calcularValor();

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getDiaDePagamento() {
        return diaDePagamento;
    }
    
    
}
