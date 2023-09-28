package com.bonnerlima.cliente;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Cliente;
import com.bonnerlima.model.enuns.Sexo;

public class ClienteInsertTest extends ManagerTest {

    @Test
    public void insertClienteTransaction() {
        Cliente cliente = new Cliente();
        cliente.setNome("Amigo C");
        cliente.setSexo(Sexo.MASCULINO);

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente clientedicionado = entityManager.find(Cliente.class, cliente.getId());

        Assert.assertNotNull(clientedicionado);

    }
}
