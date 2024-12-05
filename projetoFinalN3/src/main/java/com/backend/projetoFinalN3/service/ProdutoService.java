package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.ProdutoDTO;
import com.backend.projetoFinalN3.mapper.ProdutoMapper;
import com.backend.projetoFinalN3.model.Produto;
import com.backend.projetoFinalN3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoMapper produtoMapper;

    public ProdutoDTO criarProduto(ProdutoDTO produtoDTO) {
        Produto produto = produtoMapper.toEntity(produtoDTO);
        Produto salvo = produtoRepository.save(produto);
        return produtoMapper.toDTO(salvo);
    }
}
