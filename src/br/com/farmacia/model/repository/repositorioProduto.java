package br.com.farmacia.model.repository;

import br.com.farmacia.model.entities.Produto;
import br.com.farmacia.model.interfaces.repository.IRepositorioProduto;

import java.util.ArrayList;
import java.util.List;

public class repositorioProduto implements IRepositorioProduto {

    List<Produto> listaProduto = new ArrayList<Produto>();

    @Override
    public boolean salvarProduto(Produto produto) {

        try {
            listaProduto.add(produto);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deletarProduto(long pd) {
        return false;
    }

    @Override
    public List<Produto> listarProduto() {
        return listaProduto;
    }

    @Override
    public boolean alterarProduto(Produto produto) {
        return false;
    }
}
