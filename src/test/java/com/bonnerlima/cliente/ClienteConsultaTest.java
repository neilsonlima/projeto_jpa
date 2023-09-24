package com.bonnerlima.cliente;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Cliente;

public class ClienteConsultaTest extends ManagerTest {

    @Test
    public void buscaClientePorId() {
        Cliente cliente = entityManager.find(Cliente.class, 1);

        Assert.assertNotNull(cliente);
    }

    @Test
    public void buscaClientePorReferencia() {
        Cliente cliente = entityManager.find(Cliente.class, 1);

        cliente.setNome("Amigo AA");

        entityManager.refresh(cliente);

        Assert.assertEquals("Amigo A", cliente.getNome());
    }
}
