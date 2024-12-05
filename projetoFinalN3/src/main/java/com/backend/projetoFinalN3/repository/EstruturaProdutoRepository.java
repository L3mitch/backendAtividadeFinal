package com.backend.projetoFinalN3.repository;

import com.backend.projetoFinalN3.model.EstruturaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstruturaProdutoRepository extends JpaRepository<EstruturaProduto, Long> {
}
