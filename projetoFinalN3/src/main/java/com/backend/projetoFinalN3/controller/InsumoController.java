package com.backend.projetoFinalN3.controller;

import com.backend.projetoFinalN3.dto.InsumoDTO;
import com.backend.projetoFinalN3.service.InsumoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insumos")
public class InsumoController {

    @Autowired
    private InsumoService insumoService;

    @PostMapping
    public InsumoDTO criarInsumo(@Valid @RequestBody InsumoDTO insumoDTO) {
        return insumoService.criarInsumo(insumoDTO);
    }

    @GetMapping
    public List<InsumoDTO> listarInsumos() {
        return insumoService.listarInsumos();
    }

    @PutMapping("/{id}")
    public InsumoDTO atualizarInsumo(@PathVariable Long id, @RequestBody InsumoDTO insumoDTO) {
        return insumoService.atualizarInsumo(id, insumoDTO);
    }

    @DeleteMapping("/{id}")
    public void excluirInsumo(@PathVariable Long id) {
        insumoService.excluirInsumo(id);
    }
}
