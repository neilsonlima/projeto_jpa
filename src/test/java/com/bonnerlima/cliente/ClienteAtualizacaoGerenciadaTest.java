package com.bonnerlima.cliente;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Cliente;

public class ClienteAtualizacaoGerenciadaTest extends ManagerTest {

    @Test
    public void atualizacaoGerenciadaClienteTransaction() {
        Cliente cliente = entityManager.find(Cliente.class, 1);

        entityManager.getTransaction().begin();
        cliente.setNome("Amiga Atualizacao gerenciada");
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente ClienteAtualizado = entityManager.find(Cliente.class, 1);

        Assert.assertEquals("Amiga Atualizacao gerenciada", ClienteAtualizado.getNome());

    }
}
