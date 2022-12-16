package com.mycompany.contasbanco;

import java.util.ArrayList;

public class CadastroDeContas{
    private ArrayList<Conta> contas; 
    
    
    public CadastroDeContas(){
<<<<<<< HEAD
        this.contas=new ArrayList<>();
=======
        contas = new ArrayList<>();
    }
    
    public void adicionarConta(){
        contas.add(conta);  
>>>>>>> 674c2082b7b7c04eb1d1628363220f0a6c1dab63
    }
    
    public void addContas(Conta conta){
        contas.add(conta);
    }
    
<<<<<<< HEAD
    public Conta searchConta(String nome){
        for(Conta conta:contas){
           if(conta.getNomeDoCliente().equals(nome)) return conta;
        }
        return null;
    }
=======
>>>>>>> 674c2082b7b7c04eb1d1628363220f0a6c1dab63
}
