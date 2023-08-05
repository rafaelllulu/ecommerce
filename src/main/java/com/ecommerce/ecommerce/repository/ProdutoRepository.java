package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Produto;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository {
    List<Produto> listar();
    void remover(Produto produto);
    Produto salvar(Produto produto);

    Produto findOne(UUID uuid);
}
