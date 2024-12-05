package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.EstruturaProdutoDTO;
import com.backend.projetoFinalN3.mapper.ProdutoMapper;
import com.backend.projetoFinalN3.mapper.EstruturaProdutoMapper;
import com.backend.projetoFinalN3.model.Produto;
import com.backend.projetoFinalN3.model.EstruturaProduto;
import com.backend.projetoFinalN3.repository.ProdutoRepository;
import com.backend.projetoFinalN3.repository.EstruturaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstruturaProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EstruturaProdutoRepository estruturaProdutoRepository;

    @Autowired
    private EstruturaProdutoMapper estruturaProdutoMapper;

    public List<EstruturaProdutoDTO> criarEstruturas(Long produtoId, List<EstruturaProdutoDTO> estruturasDTO) {
        Produto produto = produtoRepository.findById(produtoId)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        List<EstruturaProduto> estruturas = estruturasDTO.stream()
                .map(dto -> estruturaProdutoMapper.toEntity(dto, produto))
                .collect(Collectors.toList());

        List<EstruturaProduto> salvas = estruturaProdutoRepository.saveAll(estruturas);
        return salvas.stream()
                .map(estruturaProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<EstruturaProdutoDTO> listarEstruturas(Long produtoId) {
        return estruturaProdutoRepository.findByProdutoDonoId(produtoId)
                .stream()
                .map(estruturaProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }
}
