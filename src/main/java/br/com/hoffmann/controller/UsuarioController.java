package br.com.hoffmann.controller;

import br.com.hoffmann.controller.generic.GenericCrudController;
import br.com.hoffmann.dto.UsuarioDTO;
import br.com.hoffmann.entity.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@Api(tags="Usuário")
public interface UsuarioController extends GenericCrudController<Usuario> {


     @ApiOperation(value = "Buscar pelo id")
     ResponseEntity<UsuarioDTO> findById(@PathVariable("id") Long id);


}
