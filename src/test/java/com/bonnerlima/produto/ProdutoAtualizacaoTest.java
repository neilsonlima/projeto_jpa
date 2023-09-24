package com.bonnerlima.produto;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Produto;

public class ProdutoAtualizacaoTest extends ManagerTest {

    @Test
    public void insertProdutoTransaction() {
        Produto p = new Produto();
        p.setId(1);
        p.setNome("Novo Kindle");
        p.setDescricao("A proveite o novo kindle");
        p.setPreco(new BigDecimal(799));

        entityManager.getTransaction().begin();
        entityManager.merge(p);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Produto produtoAtualizado = entityManager.find(Produto.class, 1);

        Assert.assertEquals("Novo Kindle", produtoAtualizado.getNome());

    }
}
