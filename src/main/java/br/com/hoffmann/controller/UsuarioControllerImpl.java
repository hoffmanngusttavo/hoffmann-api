package br.com.hoffmann.controller;

import br.com.hoffmann.component.UsuarioComponent;
import br.com.hoffmann.controller.generic.impl.GenericCrudControllerImpl;
import br.com.hoffmann.dto.UsuarioDTO;
import br.com.hoffmann.entity.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("usuario")
public class UsuarioControllerImpl extends GenericCrudControllerImpl<Usuario> implements UsuarioController {

    private final UsuarioComponent component;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> findById(@PathVariable("id") Long id) {
        return  ResponseEntity.ok()
                .body(component.findById(id));
    }





}
