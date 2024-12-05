package com.backend.projetoFinalN3.model;

public enum UnidadeMedida {
    PC("Peça"),
    L("Litro"),
    G("Grama"),
    M("Metro");

    private final String descricao;

    UnidadeMedida(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
