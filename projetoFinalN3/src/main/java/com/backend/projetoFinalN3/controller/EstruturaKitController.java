package com.backend.projetoFinalN3.controller;

import com.backend.projetoFinalN3.dto.EstruturaKitDTO;
import com.backend.projetoFinalN3.service.EstruturaKitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kits/{kitId}/estruturas")
public class EstruturaKitController {

    @Autowired
    private EstruturaKitService estruturaKitService;

    @PostMapping
    public List<EstruturaKitDTO> criarEstruturas(
            @PathVariable Long kitId,
            @RequestBody List<EstruturaKitDTO> estruturas) {
        return estruturaKitService.criarEstruturas(kitId, estruturas);
    }

    @GetMapping
    public List<EstruturaKitDTO> listarEstruturas(@PathVariable Long kitId) {
        return estruturaKitService.listarEstruturas(kitId);
    }
}
