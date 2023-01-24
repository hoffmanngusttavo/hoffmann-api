package br.com.hoffmann.component;

import br.com.hoffmann.converter.UsuarioConverter;
import br.com.hoffmann.dto.UsuarioDTO;
import br.com.hoffmann.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioComponent {

    private final UsuarioConverter converter;
    private final UsuarioService service;

    public UsuarioDTO findById(Long id) {
        return converter.converterEntidadeParaDTO(service.findById(id));
    }
}
