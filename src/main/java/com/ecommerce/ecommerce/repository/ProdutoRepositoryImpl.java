package com.ecommerce.ecommerce.repository;


import com.ecommerce.ecommerce.entity.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Component
public class ProdutoRepositoryImpl implements ProdutoRepository{
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Produto> listar(){
        TypedQuery<Produto> query = manager.createQuery("from produto", Produto.class);
        return query.getResultList();
    }

    @Override
    public Produto salvar(Produto produto){
        return manager.merge(produto);
    }

    @Override
    public void remover(Produto produto){
        manager.remove(produto);
        System.out.println("Produto removido com sucesso!");
    }

    public Produto findOne(UUID uuid){
        return manager.find(Produto.class, uuid);
    }
}
