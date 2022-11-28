package com.mycompany.contasbanco;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeContas {
    private ArrayList<String> contas;
    
    
    public void adicionarConta(){
        Scanner input= new Scanner(System.in);
        contas = new ArrayList<>();
        
        System.out.print("digite o nome da conta:");
        String conta=input.next();
        
        contas.add(conta);  
    }
    
    public void searchContas(){
        Scanner input= new Scanner(System.in);
        System.out.print("Digite o nome do usuario para encontras a conta:");
        
        String pesquisa = input.next();
        if(!contas.contains(pesquisa))
            System.out.println(pesquisa + "não existe ");
        else
            System.out.println("existe: "+pesquisa);
    }

   
    
}