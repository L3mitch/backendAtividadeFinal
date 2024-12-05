package com.backend.projetoFinalN3.mapper;

import com.backend.projetoFinalN3.dto.EstruturaKitDTO;
import com.backend.projetoFinalN3.model.EstruturaKit;
import com.backend.projetoFinalN3.model.Kit;
import com.backend.projetoFinalN3.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class EstruturaKitMapper {

    public EstruturaKitDTO toDTO(EstruturaKit estrutura) {
        EstruturaKitDTO dto = new EstruturaKitDTO();
        dto.setProdutoPAId(estrutura.getProdutoPA().getId());
        dto.setQuantidade(estrutura.getQuantidade());
        return dto;
    }

    public EstruturaKit toEntity(EstruturaKitDTO dto, Kit kitDono) {
        EstruturaKit estrutura = new EstruturaKit();
        estrutura.setKitDono(kitDono);

        Produto produtoPA = new Produto();
        produtoPA.setId(dto.getProdutoPAId());
        estrutura.setProdutoPA(produtoPA);

        estrutura.setQuantidade(dto.getQuantidade());
        return estrutura;
    }
}
