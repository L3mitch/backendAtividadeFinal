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
    private String produto;
    private Integer quantidade;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime data; //  Vou usar isso para guardar as informações sobre datas de eventos :3
    private String evento; // Aqui fica salvo os eventos que ocorreram

    public Insumo(String produto, Integer quantidade, LocalDateTime data, String evento){
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
        this.evento = evento;
    }

}