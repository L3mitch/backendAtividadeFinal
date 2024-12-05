package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.KitDTO;
import com.backend.projetoFinalN3.mapper.KitMapper;
import com.backend.projetoFinalN3.model.Kit;
import com.backend.projetoFinalN3.repository.KitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitService {

    @Autowired
    private KitRepository kitRepository;

    @Autowired
    private KitMapper kitMapper;

    public KitDTO criarKit(KitDTO kitDTO) {
        Kit kit = kitMapper.toEntity(kitDTO);
        Kit savedKit = kitRepository.save(kit);
        return kitMapper.toDTO(savedKit);
    }
}
