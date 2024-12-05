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
        return new KitDTO(
                kit.getId(),
                kit.getCodigo(),
                kit.getDescricao(),
                kit.getPrecoVenda(),
                kit.getEstruturaKit()
                        .stream()
                        .map(this::toEstruturaKitDTO)
                        .collect(Collectors.toList())
        );
    }

    public Kit toEntity(KitDTO dto) {
        Kit kit = new Kit();
        kit.setCodigo(dto.codigo());
        kit.setDescricao(dto.descricao());
        kit.setPrecoVenda(dto.precoVenda());
        kit.setEstruturaKit(dto.estruturaKit()
                .stream()
                .map(this::toEstruturaKit)
                .collect(Collectors.toList()));
        return kit;
    }

    private EstruturaKitDTO toEstruturaKitDTO(EstruturaKit estrutura) {
        return new EstruturaKitDTO(estrutura.getProdutoPA().getId(),estrutura.getQuantidade());

    }

    private EstruturaKit toEstruturaKit(EstruturaKitDTO dto) {
        EstruturaKit estrutura = new EstruturaKit();
        Produto produtoPA = new Produto(); // Cria um objeto Produto
        produtoPA.setId(dto.produtoPAId()); // Define o ID do produtoPA
        estrutura.setProdutoPA(produtoPA);
        estrutura.setQuantidade(dto.quantidade());
        return estrutura;
    }
}
