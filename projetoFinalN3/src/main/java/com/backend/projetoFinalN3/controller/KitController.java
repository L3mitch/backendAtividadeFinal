package com.backend.projetoFinalN3.controller;

import com.backend.projetoFinalN3.dto.KitDTO;
import com.backend.projetoFinalN3.service.KitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kits")
public class KitController {

    @Autowired
    private KitService kitService;

    @PostMapping
    public KitDTO criarKit(@RequestBody KitDTO kitDTO) {
        return kitService.criarKit(kitDTO);
    }
}
