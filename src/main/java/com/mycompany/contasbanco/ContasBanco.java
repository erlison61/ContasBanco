package com.mycompany.contasbanco;

public class ContasBanco {

    public static void main(String[] args) {
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
