package com.bonnerlima.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    @Column(name = "parent_id")
    private Integer categoriaPai;
}
