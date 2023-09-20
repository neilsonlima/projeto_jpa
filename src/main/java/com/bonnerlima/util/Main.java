package com.bonnerlima.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bonnerlima.model.Produto;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto_jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Produto produto = entityManager.find(Produto.class, 1);

        System.out.println("===================================================================");
        System.out.println(produto);
        System.out.println(produto.isAtivo());
        System.out.println("===================================================================");

        entityManager.close();
        entityManagerFactory.close();
    }
}