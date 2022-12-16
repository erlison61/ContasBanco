package com.mycompany.contasbanco;

public class ContasBanco {

    public static void main(String[] args) {
        CadastroDeContas cs= new CadastroDeContas();
        
        ContaDeAgua c1=new ContaDeAgua("joão", 13,30.5f,100);
        ContaDeEnergia c2=new ContaDeEnergia("Maria", 18,30.5f,100);
        
        double res1= c1.calcularValor();
        double res2= c2.calcularValor();
        
        System.out.println(res1);
        System.out.println(res2);
        
        cs.addContas(c1);
        cs.addContas(c2);
        
        Conta res=cs.searchConta("joão");
        
        System.out.println(res);  
       /*
        onde esta acontecendo o polimorfismo?
        R= na classe abstrata calcularValor(), que se repete 
        na classe contaDeAgua e na classe contaDeLuz
        (polimorfismo de sobreposição).
        
        
        
        Quais seriam as alterações necessárias no código da
        primeira questão para adicionar uma nova conta,como uma conta IPTU? 
        
        R= seria necesserio a mudança nos nomes dos atributos para 
        'areaconstruida'
        'valoEmMetrosQuadradosDaRegião'
        'aliquotaDoImovel'
        
        e o calcularValor() ficaria:
        ('areaConstruida' * 'valorEmMetrosQuadradosDaRegião')* 'aliquotaDoImovel'
        

        */
    }
}
