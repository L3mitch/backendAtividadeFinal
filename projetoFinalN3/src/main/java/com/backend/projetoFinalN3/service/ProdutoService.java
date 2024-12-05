package com.backend.projetoFinalN3.service;

import com.backend.projetoFinalN3.dto.ProdutoDTO;
import com.backend.projetoFinalN3.mapper.ProdutoMapper;
import com.backend.projetoFinalN3.model.Produto;
import com.backend.projetoFinalN3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<ProdutoDTO> listarProdutos() {
        return produtoRepository.findAll()
                .stream()
                .map(produtoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProdutoDTO atualizarProduto(Long id, ProdutoDTO produtoDTO) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produto.setCodigo(produtoDTO.getCodigo());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setUnidadeMedida(produtoDTO.getUnidadeMedida());
        produto.setPreco(produtoDTO.getPreco());
        produto.setPrecoVenda(produtoDTO.getPrecoVenda());
        produto.setTipo(produtoDTO.getTipo());
        Produto atualizado = produtoRepository.save(produto);
        return produtoMapper.toDTO(atualizado);
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
