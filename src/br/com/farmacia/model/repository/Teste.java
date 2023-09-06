package br.com.farmacia.model.repository;

import br.com.farmacia.model.entities.Produto;

public class Teste {
    public static void main(String[] args) {

        repositorioProduto rp = new repositorioProduto();
        Produto produto1 = new Produto("Tilenol",10.0,100);
        rp.salvarProduto(produto1);
        System.out.println(rp.listarProduto().toString());

    }
}
