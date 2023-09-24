package com.bonnerlima.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bonnerlima.model.enuns.StatusPagamento;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pagamentos_boletos")
public class PagamentoBoleto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "pedido_id")
    private Integer pedido;

    @Column(name = "codigo_barras")
    private Integer codigoBarras;

    @Enumerated(EnumType.STRING)
    private StatusPagamento status;
}
