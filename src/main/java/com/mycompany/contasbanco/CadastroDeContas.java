package com.mycompany.contasbanco;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeContas {
    private ArrayList<String> contas;
    
    
    public CadastroDeContas(){
        contas = new ArrayList<>();
    }
    
    public void adicionarConta(){
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
