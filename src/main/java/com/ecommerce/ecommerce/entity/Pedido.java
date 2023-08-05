package com.ecommerce.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido {
    @Id
    @EqualsAndHashCode.Include
    private Long id;

    private UUID uuid;

    @ManyToOne
    private Produto produtos;
}
