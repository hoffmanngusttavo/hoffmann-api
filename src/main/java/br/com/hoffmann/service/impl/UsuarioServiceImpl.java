package br.com.hoffmann.service.impl;

import br.com.hoffmann.entity.Usuario;
import br.com.hoffmann.service.UsuarioService;
import br.com.hoffmann.service.generic.impl.GenericCrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class UsuarioServiceImpl extends GenericCrudServiceImpl<Usuario> implements UsuarioService {


    @Override
    @Transactional
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
