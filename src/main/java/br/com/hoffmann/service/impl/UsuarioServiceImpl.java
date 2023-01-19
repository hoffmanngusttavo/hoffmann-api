package br.com.hoffmann.service.impl;

import br.com.hoffmann.entity.Usuario;
import br.com.hoffmann.service.UsuarioService;
import br.com.hoffmann.service.generic.impl.GenericCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends GenericCrudServiceImpl<Usuario> implements UsuarioService {


}
