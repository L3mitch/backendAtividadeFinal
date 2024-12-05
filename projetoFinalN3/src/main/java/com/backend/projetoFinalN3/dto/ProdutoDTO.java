package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;
import java.util.List;

import com.backend.projetoFinalN3.model.UnidadeMedida;

public record ProdutoDTO(
        Long id,
        String codigo,
        String descricao,
        UnidadeMedida unidadeMedida,
        BigDecimal preco,
        BigDecimal precoVenda,
        String tipo, // "PE" ou "PA"
        List<EstruturaProdutoDTO> estruturaPadrao
)
{ }
