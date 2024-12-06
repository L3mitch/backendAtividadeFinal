package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;

public class EstruturaProdutoDTO {
    private Long insumoOuProdutoId; // ID do insumo ou produto do tipo PE
    private BigDecimal quantidade;

    // Getters e Setters
    public Long getInsumoOuProdutoId() {
        return insumoOuProdutoId;
    }

    public void setInsumoOuProdutoId(Long insumoOuProdutoId) {
        this.insumoOuProdutoId = insumoOuProdutoId;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
