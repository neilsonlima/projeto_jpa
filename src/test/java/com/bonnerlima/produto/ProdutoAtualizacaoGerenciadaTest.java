package com.bonnerlima.produto;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Produto;

public class ProdutoAtualizacaoGerenciadaTest extends ManagerTest {

    @Test
    public void atualizacaoGerenciadaProdutoTransaction() {
        Produto p = entityManager.find(Produto.class, 1);

        entityManager.getTransaction().begin();
        p.setNome("Atualizacao Gerenciada - Kindle");
        entityManager.getTransaction().commit();

        entityManager.clear();

        Produto produtoAtualizado = entityManager.find(Produto.class, 1);

        Assert.assertEquals("Atualizacao Gerenciada - Kindle", produtoAtualizado.getNome());

    }
}
