package com.mycompany.contasbanco;

import java.util.ArrayList;

public class CadastroDeContas{
    private ArrayList<Conta> contas; 
    
    
    public CadastroDeContas(){

        this.contas=new ArrayList<>();
     
    }
    
    public void adicionarConta(){
        contas.add(conta);  

    }
    
    public void addContas(Conta conta){
        contas.add(conta);
    }
    

    public Conta searchConta(String nome){
        for(Conta conta:contas){
           if(conta.getNomeDoCliente().equals(nome)) return conta;
        }
        return null;
    }
}
