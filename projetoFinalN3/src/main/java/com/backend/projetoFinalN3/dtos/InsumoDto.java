package com.backend.projetoFinalN3.dtos;

import java.util.UUID;

public record InsumoDto(
        UUID id,
        String produto,
        Integer quantidade
) {
}
