package br.com.hoffmann.repository;

import br.com.hoffmann.entity.Usuario;
import br.com.hoffmann.repository.generic.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends GenericCrudRepository<Usuario> {



}
