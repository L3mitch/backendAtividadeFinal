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
        return new ProdutoDTO(
                produto.getId(),
                produto.getCodigo(),
                produto.getDescricao(),
                produto.getUnidadeMedida(),
                produto.getPreco(),
                produto.getPrecoVenda(),
                produto.getTipo(),
                produto.getEstruturaPadrao()
                        .stream()
                        .map(this::toEstruturaProdutoDTO)
                        .collect(Collectors.toList())

        );
    }

    public Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setCodigo(dto.codigo());
        produto.setDescricao(dto.descricao());
        produto.setPreco(dto.preco());
        produto.setPrecoVenda(dto.precoVenda());
        produto.setTipo(dto.tipo());
        produto.setUnidadeMedida(dto.unidadeMedida());
        return produto;
    }

    private EstruturaProdutoDTO toEstruturaProdutoDTO(EstruturaProduto estrutura) {
        EstruturaProdutoDTO dto = new EstruturaProdutoDTO(estrutura.getInsumoOuProduto().getId(),estrutura.getQuantidade());
        return dto;
    }

    private EstruturaProduto toEstruturaProduto(EstruturaProdutoDTO dto, Produto produtoDono) {
        EstruturaProduto estrutura = new EstruturaProduto();
        estrutura.setProdutoDono(produtoDono);

        // Mapeia o insumo ou produto a partir do ID
        Insumo insumoOuProduto = new Insumo();
        insumoOuProduto.setId(dto.insumoOuProdutoId());
        estrutura.setInsumoOuProduto(insumoOuProduto);

        estrutura.setQuantidade(dto.quantidade());
        return estrutura;
    }
}
