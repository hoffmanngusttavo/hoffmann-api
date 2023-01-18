package br.com.hoffmann.controller;

import br.com.hoffmann.model.Usuario;
import br.com.hoffmann.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;


    @GetMapping
    public List<Usuario> listAll(){
        return usuarioRepository.findAll();
    }

}
