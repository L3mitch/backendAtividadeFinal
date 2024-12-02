package com.backend.projetoFinalN3.repositories;

import com.backend.projetoFinalN3.models.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InsumoRepository extends JpaRepository<Insumo, UUID> {
}
