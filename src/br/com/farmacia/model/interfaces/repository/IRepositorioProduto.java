package br.com.farmacia.model.interfaces.repository;

import br.com.farmacia.model.entities.Produto;

import java.time.Period;
import java.util.List;

public interface IRepositorioProduto {

    boolean salvarProduto(Produto produto);
    boolean deletarProduto(long pd);
    List<Produto> listarProduto();
    boolean alterarProduto(Produto produto);


}
