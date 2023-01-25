package br.com.hoffmann.dto.input;

import br.com.hoffmann.entity.baseEntity.DadosAuditoria;
import lombok.Data;

@Data
public class UsuarioInputDTO {


    private String login;
    private String senha;
    private String criadoPor;

    public DadosAuditoria getAuditoria() {
        return DadosAuditoria.builder()
                .createdBy(criadoPor)
                .updatedBy(criadoPor)
                .build();
    }
}
