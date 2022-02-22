package com.teste.multi.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Setter
@Getter
public class Produto {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String codigo;

    @Column
    private String nome;

    @Column
    private String produto;

    @Column
    private String sku;

    @Column(length=1000)
    private String descricao;


}
