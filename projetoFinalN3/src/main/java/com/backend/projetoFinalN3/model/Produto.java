package com.backend.projetoFinalN3.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Produto extends Insumo {

    private BigDecimal precoVenda;

    private String tipo; // "PE" ou "PA"

    @OneToMany(mappedBy = "produtoDono", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EstruturaProduto> estruturaPadrao;

    // Getters e Setters
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

    public List<EstruturaProduto> getEstruturaPadrao() {
        return estruturaPadrao;
    }

    public void setEstruturaPadrao(List<EstruturaProduto> estruturaPadrao) {
        this.estruturaPadrao = estruturaPadrao;
    }
}
