package com.backend.projetoFinalN3.dto;

import java.math.BigDecimal;
import java.util.List;

import com.backend.projetoFinalN3.model.UnidadeMedida;

public class ProdutoDTO {
    private Long id;
    private String codigo;
    private String descricao;
    private UnidadeMedida unidadeMedida; // ID da unidade de medida
    private BigDecimal preco;
    private BigDecimal precoVenda;
    private String tipo; // "PE" ou "PA"
    private List<EstruturaProdutoDTO> estruturaPadrao;

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

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<EstruturaProdutoDTO> getEstruturaPadrao() {
        return estruturaPadrao;
    }

    public void setEstruturaPadrao(List<EstruturaProdutoDTO> estruturaPadrao) {
        this.estruturaPadrao = estruturaPadrao;
    }
}
