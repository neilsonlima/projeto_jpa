package com.bonnerlima.cliente;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Cliente;
import com.bonnerlima.model.enuns.Sexo;

public class ClienteAtualizacaoTest extends ManagerTest {

    @Test
    public void atualizaClienteTransaction() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Amigo AA");
        cliente.setSexo(Sexo.FEMININO);

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente ClienteAtualizado = entityManager.find(Cliente.class, cliente.getId());

        Assert.assertEquals("Amigo AA", ClienteAtualizado.getNome());

    }

    @Test
    public void atualizaSexoClienteTransaction() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setSexo(Sexo.FEMININO);

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente ClienteAtualizado = entityManager.find(Cliente.class, 1);

        Assert.assertEquals(Sexo.FEMININO, ClienteAtualizado.getSexo());

    }
}
