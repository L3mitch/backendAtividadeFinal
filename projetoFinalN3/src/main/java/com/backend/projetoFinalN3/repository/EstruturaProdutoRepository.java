package com.backend.projetoFinalN3.repository;

import com.backend.projetoFinalN3.model.EstruturaProduto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstruturaProdutoRepository extends JpaRepository<EstruturaProduto, Long> {
    List<EstruturaProduto> findByProdutoDonoId(Long produtoId);
}
