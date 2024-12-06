package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;

public class EstruturaKitDTO {
    private Long produtoPAId; // ID do Produto Acabado
    private BigDecimal quantidade;

    // Getters e Setters
    public Long getProdutoPAId() {
        return produtoPAId;
    }

    public void setProdutoPAId(Long produtoPAId) {
        this.produtoPAId = produtoPAId;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
