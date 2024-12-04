package com.backend.projetoFinalN3.services;


import com.backend.projetoFinalN3.dtos.CriarInsumoDto;
import com.backend.projetoFinalN3.models.Insumo;
import com.backend.projetoFinalN3.repositories.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InsumoService {

    @Autowired
    private InsumoRepository insumoRepository;

    private ArrayList<Insumo> insumos;

    public void criaInsumo(CriarInsumoDto criarInsumoDto){
    }
}
