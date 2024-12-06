package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.KitDTO;
import com.backend.projetoFinalN3.mapper.KitMapper;
import com.backend.projetoFinalN3.model.Kit;
import com.backend.projetoFinalN3.repository.KitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KitService {

    @Autowired
    private KitRepository kitRepository;

    @Autowired
    private KitMapper kitMapper;

    public KitDTO criarKit(KitDTO kitDTO) {
        Kit kit = kitMapper.toEntity(kitDTO);
        Kit salvo = kitRepository.save(kit);
        return kitMapper.toDTO(salvo);
    }

    public List<KitDTO> listarKits() {
        return kitRepository.findAll()
                .stream()
                .map(kitMapper::toDTO)
                .collect(Collectors.toList());
    }

    public KitDTO atualizarKit(Long id, KitDTO kitDTO) {
        Kit kit = kitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kit não encontrado"));
        kit.setCodigo(kitDTO.getCodigo());
        kit.setDescricao(kitDTO.getDescricao());
        kit.setPrecoVenda(kitDTO.getPrecoVenda());
        Kit atualizado = kitRepository.save(kit);
        return kitMapper.toDTO(atualizado);
    }

    public void excluirKit(Long id) {
        kitRepository.deleteById(id);
    }
}
