package com.backend.projetoFinalN3.mapper;

import com.backend.projetoFinalN3.dto.InsumoDTO;
import com.backend.projetoFinalN3.model.Insumo;
import org.springframework.stereotype.Component;

@Component
public class InsumoMapper {

    public InsumoDTO toDTO(Insumo insumo) {
        return new InsumoDTO(
                insumo.getId(),
                insumo.getCodigo(),
                insumo.getDescricao(),
                insumo.getUnidadeMedida(),
                insumo.getFornecedor(),
                insumo.getPreco()
        );
    }

    public Insumo toEntity(InsumoDTO dto) {
        Insumo insumo = new Insumo();
        insumo.setCodigo(dto.codigo());
        insumo.setDescricao(dto.descricao());
        insumo.setFornecedor(dto.fornecedor());
        insumo.setPreco(dto.preco());
        insumo.setUnidadeMedida(dto.unidadeMedida());
        return insumo;
    }
}
