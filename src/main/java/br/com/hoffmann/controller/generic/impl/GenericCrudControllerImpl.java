package br.com.hoffmann.controller.generic.impl;

import br.com.hoffmann.controller.generic.GenericCrudController;
import br.com.hoffmann.entity.baseEntity.BaseEntity;
import br.com.hoffmann.service.generic.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class GenericCrudControllerImpl<T extends BaseEntity> implements GenericCrudController<T> {

    @Autowired
    private GenericCrudService service;

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
       try {
           service.deleteById(id);
           return new ResponseEntity<>("Sucesso ao apagar", HttpStatus.OK);
       }catch (Exception ex){
           return new ResponseEntity<>("Erro ao apagar", HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}