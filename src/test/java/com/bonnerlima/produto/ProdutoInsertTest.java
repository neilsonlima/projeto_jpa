package com.bonnerlima.produto;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Produto;

public class ProdutoInsertTest extends ManagerTest {

    @Test
    public void insertProdutoTransaction() {
        Produto p = new Produto();
        p.setId(2);
        p.setNome("Macbook");
        p.setAtivo(true);
        p.setDescricao("Macbook pro retina");
        p.setPreco(new BigDecimal(23000));

        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Produto produto = entityManager.find(Produto.class, 2);

        Assert.assertNotNull(produto);

    }
}
