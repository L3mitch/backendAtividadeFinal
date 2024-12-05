package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.InsumoDTO;
import com.backend.projetoFinalN3.mapper.InsumoMapper;
import com.backend.projetoFinalN3.model.Insumo;
import com.backend.projetoFinalN3.repository.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsumoService {

    @Autowired
    private InsumoRepository insumoRepository;

    @Autowired
    private InsumoMapper insumoMapper;

    public InsumoDTO criarInsumo(InsumoDTO insumoDTO) {
        Insumo insumo = insumoMapper.toEntity(insumoDTO);
        Insumo salvo = insumoRepository.save(insumo);
        return insumoMapper.toDTO(salvo);
    }

    public List<InsumoDTO> listarInsumos() {
        return insumoRepository.findAll()
                .stream()
                .map(insumoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public InsumoDTO atualizarInsumo(Long id, InsumoDTO insumoDTO) {
        Insumo insumo = insumoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Insumo não encontrado"));
        insumo.setCodigo(insumoDTO.codigo());
        insumo.setDescricao(insumoDTO.descricao());
        insumo.setUnidadeMedida(insumoDTO.unidadeMedida());
        insumo.setFornecedor(insumoDTO.fornecedor());
        insumo.setPreco(insumoDTO.preco());
        Insumo atualizado = insumoRepository.save(insumo);
        return insumoMapper.toDTO(atualizado);
    }

    public void excluirInsumo(Long id) {
        insumoRepository.deleteById(id);
    }
}
