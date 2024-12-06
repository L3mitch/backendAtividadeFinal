package com.backend.projetoFinalN3.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class EstruturaKit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "kitDonoId", nullable = false)
    private Kit kitDono;

    @ManyToOne
    @JoinColumn(name = "produtoPAId", nullable = false)
    private Produto produtoPA;

    private BigDecimal quantidade;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kit getKitDono() {
        return kitDono;
    }

    public void setKitDono(Kit kitDono) {
        this.kitDono = kitDono;
    }

    public Produto getProdutoPA() {
        return produtoPA;
    }

    public void setProdutoPA(Produto produtoPA) {
        this.produtoPA = produtoPA;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
