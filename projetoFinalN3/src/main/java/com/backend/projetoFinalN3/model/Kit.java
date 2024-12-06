package com.backend.projetoFinalN3.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Kit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String descricao;

    private BigDecimal precoVenda;

    @OneToMany(mappedBy = "kitDono", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EstruturaKit> estruturaKit;

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

    public List<EstruturaKit> getEstruturaKit() {
        return estruturaKit;
    }

    public void setEstruturaKit(List<EstruturaKit> estruturaKit) {
        this.estruturaKit = estruturaKit;
    }
}
