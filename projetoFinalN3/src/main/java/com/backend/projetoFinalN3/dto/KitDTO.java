package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;
import java.util.List;

public class KitDTO {
    private Long id;
    private String codigo;
    private String descricao;
    private BigDecimal precoVenda;
    private List<EstruturaKitDTO> estruturaKit;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public List<EstruturaKitDTO> getEstruturaKit() {
        return estruturaKit;
    }

    public void setEstruturaKit(List<EstruturaKitDTO> estruturaKit) {
        this.estruturaKit = estruturaKit;
    }
}
