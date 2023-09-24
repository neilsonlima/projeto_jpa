package com.bonnerlima.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bonnerlima.model.enuns.Sexo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;
}
