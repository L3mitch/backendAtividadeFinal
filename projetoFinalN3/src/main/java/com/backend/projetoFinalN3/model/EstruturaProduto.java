package com.backend.projetoFinalN3.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class EstruturaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produtoDonoId", nullable = false)
    private Produto produtoDono;

    @ManyToOne
    @JoinColumn(name = "insumoOuProdutoId", nullable = false)
    private Insumo insumoOuProduto;

    private BigDecimal quantidade;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProdutoDono() {
        return produtoDono;
    }

    public void setProdutoDono(Produto produtoDono) {
        this.produtoDono = produtoDono;
    }

    public Insumo getInsumoOuProduto() {
        return insumoOuProduto;
    }

    public void setInsumoOuProduto(Insumo insumoOuProduto) {
        this.insumoOuProduto = insumoOuProduto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
