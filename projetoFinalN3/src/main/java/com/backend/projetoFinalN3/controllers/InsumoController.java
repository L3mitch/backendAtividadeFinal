package com.backend.projetoFinalN3.controllers;

import com.backend.projetoFinalN3.dtos.CriarInsumoDto;
import com.backend.projetoFinalN3.services.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Insumo")
public class InsumoController {

    @Autowired
    private InsumoService insumoService;

    @GetMapping
    public String getInsumo(){
        return "Hello World";
    }



}
