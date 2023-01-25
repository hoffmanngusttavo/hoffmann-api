package br.com.hoffmann.controller;

import br.com.hoffmann.component.UsuarioComponent;
import br.com.hoffmann.controller.generic.impl.GenericCrudControllerImpl;
import br.com.hoffmann.dto.UsuarioDTO;
import br.com.hoffmann.dto.input.UsuarioInputDTO;
import br.com.hoffmann.entity.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void cadastrarNovo(@RequestBody @Valid UsuarioInputDTO dto) {
        component.salvarNovo(dto);
    }


}
