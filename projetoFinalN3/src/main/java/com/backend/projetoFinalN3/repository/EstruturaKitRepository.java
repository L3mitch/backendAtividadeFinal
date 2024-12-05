package com.backend.projetoFinalN3.repository;

import com.backend.projetoFinalN3.model.EstruturaKit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstruturaKitRepository extends JpaRepository<EstruturaKit, Long> {
}
