package com.bonnerlima.cliente;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Cliente;

public class ClienteRemoveTest extends ManagerTest {

    @Test
    public void removeClienteTransaction() {
        Cliente cliente = entityManager.find(Cliente.class, 1);

        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();

        Cliente checkCliente = entityManager.find(Cliente.class, 1);

        Assert.assertNull(checkCliente);
    }
}
