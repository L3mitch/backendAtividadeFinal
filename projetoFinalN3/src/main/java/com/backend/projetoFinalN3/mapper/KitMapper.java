package com.backend.projetoFinalN3.mapper;

import com.backend.projetoFinalN3.dto.KitDTO;
import com.backend.projetoFinalN3.dto.EstruturaKitDTO;
import com.backend.projetoFinalN3.model.Kit;
import com.backend.projetoFinalN3.model.EstruturaKit;
import com.backend.projetoFinalN3.model.Produto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class KitMapper {

    public KitDTO toDTO(Kit kit) {
        KitDTO dto = new KitDTO();
        dto.setId(kit.getId());
        dto.setCodigo(kit.getCodigo());
        dto.setDescricao(kit.getDescricao());
        dto.setPrecoVenda(kit.getPrecoVenda());
        if (kit.getEstruturaKit() != null) {
            dto.setEstruturaKit(kit.getEstruturaKit()
                .stream()
                .map(this::toEstruturaKitDTO)
                .collect(Collectors.toList()));
        } else {
            dto.setEstruturaKit(null);
        }
        return dto;
    }

    public Kit toEntity(KitDTO dto) {
        Kit kit = new Kit();
        kit.setCodigo(dto.getCodigo());
        kit.setDescricao(dto.getDescricao());
        kit.setPrecoVenda(dto.getPrecoVenda());
        kit.setEstruturaKit(dto.getEstruturaKit()
                .stream()
                .map(this::toEstruturaKit)
                .collect(Collectors.toList()));
        return kit;
    }

    private EstruturaKitDTO toEstruturaKitDTO(EstruturaKit estrutura) {
        EstruturaKitDTO dto = new EstruturaKitDTO();
        dto.setProdutoPAId(estrutura.getProdutoPA().getId());
        dto.setQuantidade(estrutura.getQuantidade());
        return dto;
    }

    private EstruturaKit toEstruturaKit(EstruturaKitDTO dto) {
        EstruturaKit estrutura = new EstruturaKit();
        Produto produtoPA = new Produto(); // Cria um objeto Produto
        produtoPA.setId(dto.getProdutoPAId()); // Define o ID do produtoPA
        estrutura.setProdutoPA(produtoPA);
        estrutura.setQuantidade(dto.getQuantidade());
        return estrutura;
    }
}
