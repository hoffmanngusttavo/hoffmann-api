package br.com.hoffmann.controller;

import br.com.hoffmann.controller.generic.GenericCrudController;
import br.com.hoffmann.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;


public interface UsuarioController extends GenericCrudController<Usuario> {


     ResponseEntity<Usuario> findById(@PathVariable("id") Long id);


}
