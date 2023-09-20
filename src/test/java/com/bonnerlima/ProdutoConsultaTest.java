package com.bonnerlima;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.model.Produto;

public class ProdutoConsultaTest  extends ManagerTest{


    @Test
    public void buscaProdutoPorId() {
        Produto produto = entityManager.find(Produto.class, 1);

        Assert.assertNotNull(produto);
    }
}
