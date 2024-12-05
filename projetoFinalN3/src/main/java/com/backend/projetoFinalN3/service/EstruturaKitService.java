package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.EstruturaKitDTO;
import com.backend.projetoFinalN3.mapper.EstruturaKitMapper;
import com.backend.projetoFinalN3.model.Kit;
import com.backend.projetoFinalN3.model.EstruturaKit;
import com.backend.projetoFinalN3.repository.KitRepository;
import com.backend.projetoFinalN3.repository.EstruturaKitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstruturaKitService {

    @Autowired
    private KitRepository kitRepository;

    @Autowired
    private EstruturaKitRepository estruturaKitRepository;

    @Autowired
    private EstruturaKitMapper estruturaKitMapper;

    public List<EstruturaKitDTO> criarEstruturas(Long kitId, List<EstruturaKitDTO> estruturasDTO) {
        Kit kit = kitRepository.findById(kitId)
                .orElseThrow(() -> new RuntimeException("Kit não encontrado"));

        List<EstruturaKit> estruturas = estruturasDTO.stream()
                .map(dto -> estruturaKitMapper.toEntity(dto, kit))
                .collect(Collectors.toList());

        List<EstruturaKit> salvas = estruturaKitRepository.saveAll(estruturas);
        return salvas.stream()
                .map(estruturaKitMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<EstruturaKitDTO> listarEstruturas(Long kitId) {
        return estruturaKitRepository.findByKitDonoId(kitId)
                .stream()
                .map(estruturaKitMapper::toDTO)
                .collect(Collectors.toList());
    }
}
