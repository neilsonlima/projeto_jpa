package com.bonnerlima.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.bonnerlima.ManagerTest;
import com.bonnerlima.model.Pedido;
import com.bonnerlima.model.PedidoEnderecoEntrega;
import com.bonnerlima.model.enuns.StatusPedido;

public class PedidoInsertTest extends ManagerTest {

    @Test
    public void insertProdutoEnderecoEntregaTransaction() {

        PedidoEnderecoEntrega end = new PedidoEnderecoEntrega();
        end.setCep("3212332");
        end.setLogradouro("Rua da Penha");
        end.setNumero("123");
        end.setComplemento("casa");
        end.setCidade("Para de minas");
        end.setBairro("Quaqluer");
        end.setEstado("MG");

        Pedido pedido = new Pedido();
        pedido.setId(1);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setStatus(StatusPedido.AGUARDANDO);
        pedido.setTotal(new BigDecimal(23));
        pedido.setEnderecoEntrega(end);

        entityManager.getTransaction().begin();
        entityManager.persist(pedido);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Pedido pedidoCriado = entityManager.find(Pedido.class, 1);

        Assert.assertNotNull(pedidoCriado);

    }
}
