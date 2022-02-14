package com.dio.inversionOfControlExercise;

public class VendaDeProduto {

    private Log log;
    //a classe venda de produto não precisa mais se preocupar com a criação de uma classe Log,
    // apenas recebeu uma instância e está trabalhando em cima dela.

    public void vendaDeProduto (Log logVenda) {
        this.log = logVenda;
    }
    // esse método apenas está afirmando que esse log se refere ao log venda

    public void VendeProduto (Produto produto) {
        log.gravar("nome produto");
    }
}
