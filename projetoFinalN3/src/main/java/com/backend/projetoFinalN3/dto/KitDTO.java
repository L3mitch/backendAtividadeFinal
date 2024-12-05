package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;
import java.util.List;

public record KitDTO(
        Long id,
        String codigo,
        String descricao,
        BigDecimal precoVenda,
        List<EstruturaKitDTO> estruturaKit
) {}
