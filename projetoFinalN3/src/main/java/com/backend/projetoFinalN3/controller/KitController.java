package com.backend.projetoFinalN3.controller;

import com.backend.projetoFinalN3.dto.KitDTO;
import com.backend.projetoFinalN3.service.KitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kits")
public class KitController {

    @Autowired
    private KitService kitService;

    @PostMapping
    public KitDTO criarKit(@RequestBody KitDTO kitDTO) {
        return kitService.criarKit(kitDTO);
    }

    @GetMapping
    public List<KitDTO> listarKits() {
        return kitService.listarKits();
    }

    @PutMapping("/{id}")
    public KitDTO atualizarKit(@PathVariable Long id, @RequestBody KitDTO kitDTO) {
        return kitService.atualizarKit(id, kitDTO);
    }

    @DeleteMapping("/{id}")
    public void excluirKit(@PathVariable Long id) {
        kitService.excluirKit(id);
    }
}
