package com.backend.projetoFinalN3.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public record CriarInsumoDto(
    @Size(
            min = 2,
            max = 256,
            message = "O nome do produto precisa ter entre 2 e 256 caracteres"
    )
    String insumo,
    @Min(
            value = 1,
            message = "Você deve inserir no mínimo 1 unidade do produto!"
    )
    Integer quantidade
) {}
