package br.com.hoffmann.controller;

import br.com.hoffmann.controller.generic.impl.GenericCrudControllerImpl;
import br.com.hoffmann.entity.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioControllerImpl extends GenericCrudControllerImpl<Usuario> implements UsuarioController {



}
