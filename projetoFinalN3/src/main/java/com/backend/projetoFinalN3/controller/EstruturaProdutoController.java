package com.backend.projetoFinalN3.controller;

import com.backend.projetoFinalN3.dto.EstruturaProdutoDTO;
import com.backend.projetoFinalN3.service.EstruturaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos/{produtoId}/estruturas")
public class EstruturaProdutoController {

    @Autowired
    private EstruturaProdutoService estruturaProdutoService;

    @PostMapping
    public List<EstruturaProdutoDTO> criarEstruturas(
            @PathVariable Long produtoId,
            @RequestBody List<EstruturaProdutoDTO> estruturas) {
        return estruturaProdutoService.criarEstruturas(produtoId, estruturas);
    }

    @GetMapping
    public List<EstruturaProdutoDTO> listarEstruturas(@PathVariable Long produtoId) {
        return estruturaProdutoService.listarEstruturas(produtoId);
    }
}
