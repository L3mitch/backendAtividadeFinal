package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;

public record EstruturaProdutoDTO(
        Long insumoOuProdutoId,
        BigDecimal quantidade
) {}
