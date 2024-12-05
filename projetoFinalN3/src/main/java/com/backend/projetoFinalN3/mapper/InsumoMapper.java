package com.backend.projetoFinalN3.mapper;

import com.backend.projetoFinalN3.dto.InsumoDTO;
import com.backend.projetoFinalN3.model.Insumo;
import org.springframework.stereotype.Component;

@Component
public class InsumoMapper {

    public InsumoDTO toDTO(Insumo insumo) {
        InsumoDTO dto = new InsumoDTO();
        dto.setId(insumo.getId());
        dto.setCodigo(insumo.getCodigo());
        dto.setDescricao(insumo.getDescricao());
        dto.setFornecedor(insumo.getFornecedor());
        dto.setPreco(insumo.getPreco());
        dto.setUnidadeMedida(insumo.getUnidadeMedida());
        return dto;
    }

    public Insumo toEntity(InsumoDTO dto) {
        Insumo insumo = new Insumo();
        insumo.setCodigo(dto.getCodigo());
        insumo.setDescricao(dto.getDescricao());
        insumo.setFornecedor(dto.getFornecedor());
        insumo.setPreco(dto.getPreco());
        insumo.setUnidadeMedida(dto.getUnidadeMedida());
        return insumo;
    }
}
