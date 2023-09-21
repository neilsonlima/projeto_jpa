package com.bonnerlima.produto;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Produto;

public class ProdutoConsultaTest extends ManagerTest {

    @Test
    public void buscaProdutoPorId() {
        Produto produto = entityManager.find(Produto.class, 1);

        Assert.assertNotNull(produto);
    }

    @Test
    public void buscaProdutoPorReferencia() {
        Produto produto = entityManager.find(Produto.class, 1);

        produto.setNome("MacBook");

        entityManager.refresh(produto);

        Assert.assertEquals("Kindle", produto.getNome());
    }
}
