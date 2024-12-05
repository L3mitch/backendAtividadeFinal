package com.backend.projetoFinalN3.mapper;

import com.backend.projetoFinalN3.dto.EstruturaProdutoDTO;
import com.backend.projetoFinalN3.model.EstruturaProduto;
import com.backend.projetoFinalN3.model.Produto;
import com.backend.projetoFinalN3.model.Insumo;
import org.springframework.stereotype.Component;

@Component
public class EstruturaProdutoMapper {

    public EstruturaProdutoDTO toDTO(EstruturaProduto estrutura) {
        EstruturaProdutoDTO dto = new EstruturaProdutoDTO();
        dto.setInsumoOuProdutoId(estrutura.getInsumoOuProduto().getId());
        dto.setQuantidade(estrutura.getQuantidade());
        return dto;
    }

    public EstruturaProduto toEntity(EstruturaProdutoDTO dto, Produto produtoDono) {
        EstruturaProduto estrutura = new EstruturaProduto();
        estrutura.setProdutoDono(produtoDono);

        Insumo insumoOuProduto = new Insumo();
        insumoOuProduto.setId(dto.getInsumoOuProdutoId());
        estrutura.setInsumoOuProduto(insumoOuProduto);

        estrutura.setQuantidade(dto.getQuantidade());
        return estrutura;
    }
}
