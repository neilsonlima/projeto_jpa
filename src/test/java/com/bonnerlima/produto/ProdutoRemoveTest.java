package com.bonnerlima.produto;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Produto;

public class ProdutoRemoveTest extends ManagerTest {

    @Test
    public void removeProdutoTransaction() {
        Produto p = entityManager.find(Produto.class, 3);

        entityManager.getTransaction().begin();
        entityManager.remove(p);
        entityManager.getTransaction().commit();

        Produto checkProduto = entityManager.find(Produto.class, 3);

        Assert.assertNull(checkProduto);
    }
}
