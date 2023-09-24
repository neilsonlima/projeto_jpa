package com.bonnerlima.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Produto implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Boolean ativo;
}
