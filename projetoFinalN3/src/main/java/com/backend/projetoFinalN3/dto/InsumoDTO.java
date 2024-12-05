package com.backend.projetoFinalN3.dto;

import com.backend.projetoFinalN3.model.UnidadeMedida;
import java.math.BigDecimal;

public record InsumoDTO(
    Long id,
    String codigo,
    String descricao,
    UnidadeMedida unidadeMedida,
    String fornecedor,
    BigDecimal preco
){}
