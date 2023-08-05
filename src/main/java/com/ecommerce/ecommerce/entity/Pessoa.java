package com.ecommerce.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pessoa {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID uuid;


    @Column(nullable = false)
    private String nome;

    @JoinColumn(nullable = false)
    @OneToOne
    private Endereco endereco;

    @ManyToOne
    private Pedido pedidos;

}
