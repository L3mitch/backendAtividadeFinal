package com.backend.projetoFinalN3.repository;

import com.backend.projetoFinalN3.model.EstruturaKit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstruturaKitRepository extends JpaRepository<EstruturaKit, Long> {
    List<EstruturaKit> findByKitDonoId(Long kitId);
}
