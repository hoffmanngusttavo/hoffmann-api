package br.com.hoffmann.converter;

import br.com.hoffmann.dto.UsuarioDTO;
import br.com.hoffmann.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {

    public UsuarioDTO converterEntidadeParaDTO(Usuario usuario){
        return UsuarioDTO.builder()
                .criadoPor(usuario.getCreatedBy())
                .dataCadastro(usuario.getCreated())
                .login(usuario.getLogin())
                .senha(usuario.getSenha())
                .build();
    }

}
