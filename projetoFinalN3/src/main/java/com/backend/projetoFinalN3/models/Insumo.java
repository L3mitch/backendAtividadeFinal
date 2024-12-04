package com.backend.projetoFinalN3.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private Integer quantidade;

    public Insumo(String nome, Integer quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

}