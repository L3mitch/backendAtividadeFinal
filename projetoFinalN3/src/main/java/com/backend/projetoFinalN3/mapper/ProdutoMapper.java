package com.backend.projetoFinalN3.mapper;

import com.backend.projetoFinalN3.dto.ProdutoDTO;
import com.backend.projetoFinalN3.dto.EstruturaProdutoDTO;
import com.backend.projetoFinalN3.model.Produto;
import com.backend.projetoFinalN3.model.EstruturaProduto;
import com.backend.projetoFinalN3.model.Insumo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProdutoMapper {

    public ProdutoDTO toDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setCodigo(produto.getCodigo());
        dto.setDescricao(produto.getDescricao());
        dto.setPreco(produto.getPreco());
        dto.setPrecoVenda(produto.getPrecoVenda());
        dto.setTipo(produto.getTipo());
        dto.setUnidadeMedida(produto.getUnidadeMedida());
        dto.setEstruturaPadrao(produto.getEstruturaPadrao()
                .stream()
                .map(this::toEstruturaProdutoDTO)
                .collect(Collectors.toList()));
        return dto;
    }

    public Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setCodigo(dto.getCodigo());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setPrecoVenda(dto.getPrecoVenda());
        produto.setTipo(dto.getTipo());
        produto.setUnidadeMedida(dto.getUnidadeMedida());
        return produto;
    }

    private EstruturaProdutoDTO toEstruturaProdutoDTO(EstruturaProduto estrutura) {
        EstruturaProdutoDTO dto = new EstruturaProdutoDTO();
        dto.setInsumoOuProdutoId(estrutura.getInsumoOuProduto().getId());
        dto.setQuantidade(estrutura.getQuantidade());
        return dto;
    }

    private EstruturaProduto toEstruturaProduto(EstruturaProdutoDTO dto, Produto produtoDono) {
        EstruturaProduto estrutura = new EstruturaProduto();
        estrutura.setProdutoDono(produtoDono);

        // Mapeia o insumo ou produto a partir do ID
        Insumo insumoOuProduto = new Insumo();
        insumoOuProduto.setId(dto.getInsumoOuProdutoId());
        estrutura.setInsumoOuProduto(insumoOuProduto);

        estrutura.setQuantidade(dto.getQuantidade());
        return estrutura;
    }
}
