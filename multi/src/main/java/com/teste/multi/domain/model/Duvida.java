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
public class Duvida {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String codigo_produto;

    @Column
    private String duvida;

    @Column
    private String resposta;

}
